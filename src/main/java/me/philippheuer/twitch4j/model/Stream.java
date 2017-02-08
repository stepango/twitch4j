package me.philippheuer.twitch4j.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.Date;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stream {

	@JsonProperty("_id")
	private long id;

	private String game;

	private int viewers;

	private Date createdAt;

	private int videoHeight;

	private double averageFps;

	private TwitchImages preview;

	private Channel channel;
}
