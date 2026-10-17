package com.example.parking_management.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "parking_tickets") // Chuẩn hóa snake_case số nhiều
public class ParkingTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "check_in_time") // Chuẩn hóa snake_case
    private LocalDateTime checkInTime;

    @Column(name = "check_out_time") // Chuẩn hóa snake_case
    private LocalDateTime checkOutTime;

    @ManyToOne
    @JoinColumn(name = "vehicle_id") // Khóa ngoại có hậu tố _id
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "zone_id") // Khóa ngoại có hậu tố _id
    private Zone zone;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public LocalDateTime getCheckInTime() { return checkInTime; }
    public void setCheckInTime(LocalDateTime checkInTime) { this.checkInTime = checkInTime; }
    public LocalDateTime getCheckOutTime() { return checkOutTime; }
    public void setCheckOutTime(LocalDateTime checkOutTime) { this.checkOutTime = checkOutTime; }
    public Vehicle getVehicle() { return vehicle; }
    public void setVehicle(Vehicle vehicle) { this.vehicle = vehicle; }
    public Zone getZone() { return zone; }
    public void setZone(Zone zone) { this.zone = zone; }
}