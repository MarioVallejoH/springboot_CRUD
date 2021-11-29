package co.edu.uis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uis.models.Topic;
import co.edu.uis.services.TopicsService;

@RestController
public class TopicsController {
    @Autowired
    private TopicsService topicsService;

    @RequestMapping("/topics")
    public List<Topic> all_topics(){
        return topicsService.getAllTopicsList();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable("id") String id){
        return topicsService.getTopic(id);
    }
    
    @RequestMapping(method = RequestMethod.POST, value="/topics/create")
    public void addTopic(@RequestBody Topic topic){
        topicsService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/topics/delete/{id}")
    public void deleteTopic(@PathVariable("id") String id){
        topicsService.deleteTopic(id);
    }
    @RequestMapping(method = RequestMethod.PATCH, value="/topics/update_fields")
    public void updateTopicField(@RequestBody Topic topic){
        topicsService.updateTopicFields(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/topics/update")
    public void updateTopic(@RequestBody Topic topic){
        topicsService.updateTopic(topic);
    }
}
