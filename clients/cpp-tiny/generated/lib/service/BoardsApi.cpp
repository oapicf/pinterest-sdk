#include "BoardsApi.h"

using namespace Tiny;



        Response<
            BoardSection
        >
        BoardsApi::
        boardSections_create(
            
            std::string boardId
            , 
            
            BoardSection boardSection
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/boards/{board_id}/sections"; //boardId 


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_boardId("{");
                s_boardId.append("board_id");
                s_boardId.append("}");

                int pos = url.find(s_boardId);

                url.erase(pos, s_boardId.length());
                url.insert(pos, stringify(boardId));


            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | boardSection



            payload = boardSection.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            BoardSection obj(output_string);


            Response<BoardSection> response(obj, httpCode);
            return response;
        }

        Response<
            String
        >
        BoardsApi::
        boardSections_delete(
            
            std::string boardId
            , 
            
            std::string sectionId
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/boards/{board_id}/sections/{section_id}"; //boardId sectionId 


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 



                std::string s_boardId("{");
                s_boardId.append("board_id");
                s_boardId.append("}");

                int pos = url.find(s_boardId);

                url.erase(pos, s_boardId.length());
                url.insert(pos, stringify(boardId));
                std::string s_sectionId("{");
                s_sectionId.append("section_id");
                s_sectionId.append("}");

                int pos = url.find(s_sectionId);

                url.erase(pos, s_sectionId.length());
                url.insert(pos, stringify(sectionId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            Board_sections_list_200_response
        >
        BoardsApi::
        boardSections_list(
            
            std::string boardId
            , 
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/boards/{board_id}/sections"; //boardId 


            // Headers  | 

            // Query    | adAccountId bookmark pageSize 
            addQueryParam("ad_account_id",adAccountId);
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);

            // Form     | 



                std::string s_boardId("{");
                s_boardId.append("board_id");
                s_boardId.append("}");

                int pos = url.find(s_boardId);

                url.erase(pos, s_boardId.length());
                url.insert(pos, stringify(boardId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Board_sections_list_200_response obj(output_string);


            Response<Board_sections_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            Boards_list_pins_200_response
        >
        BoardsApi::
        boardSections_listPins(
            
            std::string boardId
            , 
            
            std::string sectionId
            , 
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/boards/{board_id}/sections/{section_id}/pins"; //boardId sectionId 


            // Headers  | 

            // Query    | adAccountId bookmark pageSize 
            addQueryParam("ad_account_id",adAccountId);
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);

            // Form     | 



                std::string s_boardId("{");
                s_boardId.append("board_id");
                s_boardId.append("}");

                int pos = url.find(s_boardId);

                url.erase(pos, s_boardId.length());
                url.insert(pos, stringify(boardId));
                std::string s_sectionId("{");
                s_sectionId.append("section_id");
                s_sectionId.append("}");

                int pos = url.find(s_sectionId);

                url.erase(pos, s_sectionId.length());
                url.insert(pos, stringify(sectionId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Boards_list_pins_200_response obj(output_string);


            Response<Boards_list_pins_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            BoardSection
        >
        BoardsApi::
        boardSections_update(
            
            std::string boardId
            , 
            
            std::string sectionId
            , 
            
            BoardSection boardSection
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/boards/{board_id}/sections/{section_id}"; //boardId sectionId 


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_boardId("{");
                s_boardId.append("board_id");
                s_boardId.append("}");

                int pos = url.find(s_boardId);

                url.erase(pos, s_boardId.length());
                url.insert(pos, stringify(boardId));
                std::string s_sectionId("{");
                s_sectionId.append("section_id");
                s_sectionId.append("}");

                int pos = url.find(s_sectionId);

                url.erase(pos, s_sectionId.length());
                url.insert(pos, stringify(sectionId));


            std::string payload = "";
            // Send Request
            // METHOD | PATCH
            // Body     | boardSection



            payload = boardSection.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            BoardSection obj(output_string);


            Response<BoardSection> response(obj, httpCode);
            return response;
        }

        Response<
            Board
        >
        BoardsApi::
        boards_create(
            
            BoardCreate boardCreate
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/boards"; //


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 
            addHeader("Content-Type", "application/json");





            std::string payload = "";
            // Send Request
            // METHOD | POST
            // Body     | boardCreate



            payload = boardCreate.toJson().dump();

            int httpCode = sendRequest(url, "POST", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Board obj(output_string);


            Response<Board> response(obj, httpCode);
            return response;
        }

        Response<
            String
        >
        BoardsApi::
        boards_delete(
            
            std::string boardId
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/boards/{board_id}"; //boardId 


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 



                std::string s_boardId("{");
                s_boardId.append("board_id");
                s_boardId.append("}");

                int pos = url.find(s_boardId);

                url.erase(pos, s_boardId.length());
                url.insert(pos, stringify(boardId));


            std::string payload = "";
            // Send Request
            // METHOD | DELETE
            // Body     | 
            int httpCode = sendRequest(url, "DELETE", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();


            Response<String> response(output, httpCode);
            return response;
        }

        Response<
            Board
        >
        BoardsApi::
        boards_get(
            
            std::string boardId
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/boards/{board_id}"; //boardId 


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 



                std::string s_boardId("{");
                s_boardId.append("board_id");
                s_boardId.append("}");

                int pos = url.find(s_boardId);

                url.erase(pos, s_boardId.length());
                url.insert(pos, stringify(boardId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Board obj(output_string);


            Response<Board> response(obj, httpCode);
            return response;
        }

        Response<
            Boards_list_200_response
        >
        BoardsApi::
        boards_list(
            
            std::string adAccountId
            , 
            
            BoardPrivacyFilter privacy
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
        )
        {
            std::string url = basepath + "/boards"; //


            // Headers  | 

            // Query    | adAccountId privacy bookmark pageSize 
            addQueryParam("ad_account_id",adAccountId);
            addQueryParam("privacy",privacy);
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Boards_list_200_response obj(output_string);


            Response<Boards_list_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            Boards_list_pins_200_response
        >
        BoardsApi::
        boards_listPins(
            
            std::string boardId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            std::list<CreativeType> creativeTypes
            
            , 
            
            std::string adAccountId
            , 
            
            bool pinMetrics
            
        )
        {
            std::string url = basepath + "/boards/{board_id}/pins"; //boardId 


            // Headers  | 

            // Query    | bookmark pageSize creativeTypes adAccountId pinMetrics 
            addQueryParam("bookmark",bookmark);
            addQueryParam("page_size",pageSize);
            for (auto &x : creativeTypes){
                addQueryParam("creative_types", std::string(x));
            }
            addQueryParam("ad_account_id",adAccountId);
            addQueryParam("pin_metrics",pinMetrics);

            // Form     | 



                std::string s_boardId("{");
                s_boardId.append("board_id");
                s_boardId.append("}");

                int pos = url.find(s_boardId);

                url.erase(pos, s_boardId.length());
                url.insert(pos, stringify(boardId));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Boards_list_pins_200_response obj(output_string);


            Response<Boards_list_pins_200_response> response(obj, httpCode);
            return response;
        }

        Response<
            BoardWithUpdatePrivacy
        >
        BoardsApi::
        boards_update(
            
            std::string boardId
            , 
            
            BoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate
            , 
            
            std::string adAccountId
            
        )
        {
            std::string url = basepath + "/boards/{board_id}"; //boardId 


            // Headers  | 

            // Query    | adAccountId 
            addQueryParam("ad_account_id",adAccountId);

            // Form     | 
            addHeader("Content-Type", "application/json");



                std::string s_boardId("{");
                s_boardId.append("board_id");
                s_boardId.append("}");

                int pos = url.find(s_boardId);

                url.erase(pos, s_boardId.length());
                url.insert(pos, stringify(boardId));


            std::string payload = "";
            // Send Request
            // METHOD | PATCH
            // Body     | boardWithUpdatePrivacyUpdate



            payload = boardWithUpdatePrivacyUpdate.toJson().dump();

            int httpCode = sendRequest(url, "PATCH", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            BoardWithUpdatePrivacy obj(output_string);


            Response<BoardWithUpdatePrivacy> response(obj, httpCode);
            return response;
        }



