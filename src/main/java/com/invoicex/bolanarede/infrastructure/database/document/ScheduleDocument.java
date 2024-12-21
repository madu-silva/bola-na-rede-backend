package com.invoicex.bolanarede.infrastructure.database.document;

import com.invoicex.bolanarede.infrastructure.database.document.enuns.Scheduling;
import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;
import java.time.LocalTime;

@Document(collection = "scheduling")
@Builder
public class ScheduleDocument {

    @Id
    private String id;
    @Field("userId")
    private String userId;
    @Field("court")
    private int court;
    @Field("date")
    private LocalDate date;
    @Field("hour")
    private LocalTime hour;
    @Field("status")
    private Scheduling status;

    public ScheduleDocument() {
    }

    public ScheduleDocument(
            final String id,
            final String userId,
            final int court,
            final LocalDate date,
            final LocalTime hour,
            final Scheduling status) {
        this.id = id;
        this.userId = userId;
        this.court = court;
        this.date = date;
        this.hour = hour;
        this.status = status;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getCourt() {
        return court;
    }

    public void setCourt(int court) {
        this.court = court;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHour() {
        return hour;
    }

    public void setHour(LocalTime hour) {
        this.hour = hour;
    }

    public Scheduling getStatus() {
        return status;
    }

    public void setStatus(Scheduling status) {
        this.status = status;
    }

}
