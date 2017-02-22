/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uepb;

/**
 *
 * @author Super i3
 */
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.constant.PlatformId;
import net.rithms.riot.constant.Region;


public class lol {

RiotApi api = new RiotApi("RGAPI-4d24b2f3-bf30-4689-89a5-5c12c4b3940a");
    
public static void main(String[] args) throws RiotApiException {
    
                
                RiotApi api = new RiotApi("RGAPI-4d24b2f3-bf30-4689-89a5-5c12c4b3940a");
                long meuId = api.getSummonerByName(Region.BR, "JerryCanela").getId();
                System.out.println("MeuID: " + meuId);
                try{
                    System.out.println(api.getCurrentGameInfo(PlatformId.BR, meuId).getGameId());
                } catch (Exception e){
                    System.out.println("O jogador não está em um jogo.");
                }
               
                
		
	}

        public long getGameId() throws RiotApiException{
            long meuId = api.getSummonerByName(Region.BR, "JerryCanela").getId();
            long gameId = 0;
            
                        
            try{
                    gameId = api.getCurrentGameInfo(PlatformId.BR, meuId).getGameId();
                } catch (Exception e){
                    System.out.println("O jogador não está em um jogo.");
                }
            return gameId;
        }
        


}