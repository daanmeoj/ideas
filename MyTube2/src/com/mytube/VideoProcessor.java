package com.mytube;

public class VideoProcessor {
    private VideoEncoder encoder;
    private VideoDatabase database;
    private NotificationService notifications;

    public VideoProcessor(VideoEncoder encoder, VideoDatabase database, NotificationService notifications) {
        this.encoder = encoder;
        this.database = database;
        this.notifications = notifications;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        notifications.sendEmail(video.getUser());
    }
}
