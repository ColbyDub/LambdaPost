package com.revature.post_players;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;

public class PlayerRepository {

    private final DynamoDBMapper dbReader;

    public PlayerRepository(){
        dbReader = new DynamoDBMapper(AmazonDynamoDBAsyncClientBuilder.defaultClient());
    }

    public Player save(Player player){
        dbReader.save(player, new DynamoDBSaveExpression());
        return player;
    }


}
