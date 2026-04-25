package com.smartcampus.config;

import com.smartcampus.model.Notification;
import com.smartcampus.model.Resource;
import com.smartcampus.repository.NotificationRepository;
import com.smartcampus.repository.ResourceRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.Arrays;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class DataInitializer implements CommandLineRunner {

    private final ResourceRepository resourceRepository;
    private final NotificationRepository notificationRepository;

    @Override
    public void run(String... args) {
        if (resourceRepository.count() == 0) {
            log.info("Seeding initial campus resources...");
            
            resourceRepository.saveAll(Arrays.asList(
                new Resource(null, "Main Lecture Hall (A1)", Resource.ResourceType.LECTURE_HALL, 250, "Block A, Level 1", Resource.ResourceStatus.ACTIVE, "Primary auditorium for large lectures and events."),
                new Resource(null, "Lecture Hall A2", Resource.ResourceType.LECTURE_HALL, 150, "Block A, Level 2", Resource.ResourceStatus.ACTIVE, "Secondary lecture hall for medium-sized classes."),
                new Resource(null, "Lecture Hall B1", Resource.ResourceType.LECTURE_HALL, 120, "Block B, Level 1", Resource.ResourceStatus.ACTIVE, "Specialized hall for business faculty."),
                new Resource(null, "Computer Science Lab 01", Resource.ResourceType.LAB, 45, "Block B, Level 2", Resource.ResourceStatus.ACTIVE, "Equipped with high-end workstations and networking gear."),
                new Resource(null, "AI & Robotics Lab", Resource.ResourceType.LAB, 35, "Block B, Level 3", Resource.ResourceStatus.ACTIVE, "Home to the latest robotics kits and GPU clusters."),
                new Resource(null, "Advanced Physics Lab", Resource.ResourceType.LAB, 30, "Block C, Level 3", Resource.ResourceStatus.OUT_OF_SERVICE, "Currently undergoing scheduled maintenance for optical equipment."),
                new Resource(null, "Chemistry Research Lab", Resource.ResourceType.LAB, 25, "Science Wing, Level 1", Resource.ResourceStatus.ACTIVE, "Equipped for advanced chemical analysis and synthesis."),
                new Resource(null, "Conference Room Alpha", Resource.ResourceType.MEETING_ROOM, 12, "Administrative Wing", Resource.ResourceStatus.ACTIVE, "Standard meeting room with video conferencing support."),
                new Resource(null, "Innovation Hub Beta", Resource.ResourceType.MEETING_ROOM, 20, "Block D, Level 1", Resource.ResourceStatus.ACTIVE, "Collaborative space for startup teams and brainstorming."),
                new Resource(null, "Executive Boardroom", Resource.ResourceType.MEETING_ROOM, 15, "Main Admin Block", Resource.ResourceStatus.ACTIVE, "Premium boardroom for formal meetings."),
                new Resource(null, "Portable Projector P-402", Resource.ResourceType.EQUIPMENT, 1, "Equipment Store", Resource.ResourceStatus.ACTIVE, "High-brightness portable projector for off-site presentations."),
                new Resource(null, "VR Headset Kit (10x Meta Quest 3)", Resource.ResourceType.EQUIPMENT, 10, "Digital Media Lab", Resource.ResourceStatus.ACTIVE, "Complete VR kit for immersive learning experiences."),
                new Resource(null, "Mobile Lab Laptop Cart", Resource.ResourceType.EQUIPMENT, 30, "IT Services", Resource.ResourceStatus.ACTIVE, "Cart with 30 high-performance laptops for mobile lab setup.")
            ));
            log.info("Resources seeded successfully.");
        }

        if (notificationRepository.count() == 0) {
            log.info("Seeding initial notifications...");
            
            LocalDateTime now = LocalDateTime.now();
            
            notificationRepository.saveAll(Arrays.asList(
                new Notification(null, "System Maintenance", "The Smart Campus Hub will be undergoing scheduled maintenance this Sunday from 2 AM to 4 AM.", false, Notification.NotificationType.SYSTEM, now.minusHours(2)),
                new Notification(null, "Lab Booking Confirmed", "Your booking for Computer Science Lab 01 has been confirmed for tomorrow at 10:00 AM.", false, Notification.NotificationType.BOOKING, now.minusDays(1)),
                new Notification(null, "Resource Alert: Physics Lab", "Advanced Physics Lab has been marked as 'Out of Service' due to equipment calibration.", true, Notification.NotificationType.MAINTENANCE, now.minusDays(2)),
                new Notification(null, "New Resource Added", "AI & Robotics Lab is now available for booking in Block B.", false, Notification.NotificationType.SYSTEM, now.minusHours(5)),
                new Notification(null, "Maintenance Completed", "The elevator in Block C is now fully operational.", true, Notification.NotificationType.MAINTENANCE, now.minusDays(3)),
                new Notification(null, "Upcoming Workshop", "Don't miss the 'Future of AI' workshop in Main Lecture Hall this Friday.", false, Notification.NotificationType.SYSTEM, now.minusHours(12)),
                new Notification(null, "Equipment Return Overdue", "Please return the Portable Projector P-402 to the Equipment Store by 5 PM today.", false, Notification.NotificationType.BOOKING, now.minusHours(1)),
                new Notification(null, "Comment on Resource", "A new comment has been added regarding the Wi-Fi speed in Innovation Hub Beta.", false, Notification.NotificationType.COMMENT, now.minusMinutes(30)),
                new Notification(null, "Low Battery Alert", "The VR Headset Kit in Digital Media Lab requires charging.", true, Notification.NotificationType.MAINTENANCE, now.minusDays(4))
            ));
            log.info("Notifications seeded successfully.");
        }
    }
}
