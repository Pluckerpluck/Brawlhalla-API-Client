package com.pluckerpluck.brawlhalla.client.REST;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

import com.pluckerpluck.brawlhalla.client.types.Bracket;
import com.pluckerpluck.brawlhalla.client.types.Region;

import retrofit2.Call;

/**
 * BrawlhallaService
 */
public interface BrawlhallaService {

	@GET("search")
	Call<BasicPlayer> search(@Query("steamid") String steamID);

	@GET("rankings/{bracket}/{region}/{page}")
	Call<List<LeaderboardPlayer>> rankings(@Path("bracket") Bracket bracket, @Path("region") Region region,
			@Path("page") int page, @Query("name") String name);

	@GET("player/{brawlhalla_id}/ranked")
	Call<List<DetailedRankedPlayer>> ranked(@Path("brawlhalla_id") int brawlhallaID);

}