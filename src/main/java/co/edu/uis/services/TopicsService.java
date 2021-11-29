package co.edu.uis.services;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.uis.models.Topic;

@Service
public class TopicsService {

    private List<Topic> topicList = new ArrayList<>(Arrays.asList(
            new Topic("_spring", "_Spring FrameWork", "_Spring Description"),
            new Topic("spring", "Spring FrameWork", "Spring Description"),
            new Topic("java", "Java FrameWork", "Java Description")

    ));

    public List<Topic> getAllTopicsList() {
        return topicList;
    }

    public Topic getTopic(String id) {
        return topicList.stream().filter(topic ->topic.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topicList.add(topic);
    }

    public void deleteTopic(String id) {
        Topic t = topicList.stream().filter(topic ->topic.getId().equals(id)).findFirst().get();
        topicList.remove(t);
    }

    public void updateTopic(Topic topicUpdate) {
        Topic t = topicList.stream().filter(topic ->topic.getId().equals(topicUpdate.getId())).findFirst().get();
        if(t!=null){
            topicList.remove(t);
            topicList.add(topicUpdate);
        }
    }

    public void updateTopicFields(Topic topicUpdate) {
        Topic t = topicList.stream().filter(topic ->topic.getId().equals(topicUpdate.getId())).findFirst().get();
        if(topicUpdate.getId()!=""){
            t.setId(topicUpdate.getId());
        }
        if(topicUpdate.getName()!=""){
            t.setName(topicUpdate.getName());
        }
        if(topicUpdate.getDescription()!=""){
            t.setDescription(topicUpdate.getDescription());
        }
        topicList.remove(t);
        topicList.add(t);
    }
}