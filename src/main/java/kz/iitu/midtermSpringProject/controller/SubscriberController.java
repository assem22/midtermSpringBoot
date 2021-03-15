package kz.iitu.midtermSpringProject.controller;

import kz.iitu.midtermSpringProject.entity.Subscriber;
import kz.iitu.midtermSpringProject.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class SubscriberController {

    @Autowired
    private SubscriberService subscriberService;

    public List<Subscriber> getSubscribers() {
        return subscriberService.findAllPublishers();
    }

    public void createSubscribers(Subscriber subscriber) {
        subscriberService.createSubscriber(subscriber);
    }

    public void update(Subscriber subscriber) {
        subscriberService.updateSubscriber(subscriber);
    }
}
