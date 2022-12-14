package com.app.auction.dto;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.app.auction.entities.EventEnrolment;
import com.app.auction.entities.Status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class EventDto {

	private int eventId;

	@DateTimeFormat(iso = ISO.DATE_TIME)
	@Future(message = "must be future date")
	private LocalDateTime startDate;// 2007-12-03T10:15:30

	@DateTimeFormat(iso = ISO.DATE_TIME)
	@Future(message = "must be future date")
	private LocalDateTime endDate;

	private UserDto user;

	private ItemDto item;
	
	private Status status;
}
