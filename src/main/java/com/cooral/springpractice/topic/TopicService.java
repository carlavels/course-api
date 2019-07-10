package com.cooral.springpractice.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(
			new Topic("Spring", "Spring Framework", "Spring Description"),
			new Topic("Java", "Java Beans", "Java Description"),
			new Topic("Javascript", "Node JS", "Javascript Description"),
			new Topic("C", "C Language", "C Description"),
			new Topic("Python", "Django Framework", "Python-Django Description"),
			new Topic("Python", "Flask Framework", "Python-Flask Description")
			);
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id){
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

}
