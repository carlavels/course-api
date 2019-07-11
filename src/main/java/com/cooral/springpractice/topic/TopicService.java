package com.cooral.springpractice.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<> (Arrays.asList(
			new Topic("Spring", "Spring Framework", "Spring Description"),
			new Topic("Java", "Java Beans", "Java Description"),
			new Topic("Javascript", "Node JS", "Javascript Description"),
			new Topic("C", "C Language", "C Description"),
			new Topic("Python Django", "Django Framework", "Python-Django Description"),
			new Topic("Python Flask", "Flask Framework", "Python-Flask Description")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id){
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {		
		
		for(int i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				break;
			}
		} 
		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));	
	}

	
}
