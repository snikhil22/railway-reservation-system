package com.railwayreservation.bookingservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.railwayreservation.bookingservice.model.TrainModel;

public interface TrainRepository extends MongoRepository<TrainModel, Integer> {

	@Query("{fromStation:?0,toStation:?1}")
	public List<TrainModel> findTrainByStations(String fromStation, String toStation);

	@Query("{trainName:?0,fromStation:?1,toStation:?2}")
	public TrainModel findTrainByNameAndStations(String trainName, String fromStation, String toStation);

}
