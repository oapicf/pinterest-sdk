
/*
 * BoardWithUpdatePrivacy.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BoardWithUpdatePrivacy_H_
#define TINY_CPP_CLIENT_BoardWithUpdatePrivacy_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BoardMedia.h"
#include "BoardOwner.h"
#include "BoardUpdatePrivacy.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BoardWithUpdatePrivacy{
public:

    /*! \brief Constructor.
	 */
    BoardWithUpdatePrivacy();
    BoardWithUpdatePrivacy(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BoardWithUpdatePrivacy();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Date and time of last board pins modified.
	 */
	std::string getBoardPinsModifiedAt();

	/*! \brief Set Date and time of last board pins modified.
	 */
	void setBoardPinsModifiedAt(std::string board_pins_modified_at);
	/*! \brief Get Count of collaborators on the board.
	 */
	int getCollaboratorCount();

	/*! \brief Set Count of collaborators on the board.
	 */
	void setCollaboratorCount(int collaborator_count);
	/*! \brief Get Date and time of board creation.
	 */
	std::string getCreatedAt();

	/*! \brief Set Date and time of board creation.
	 */
	void setCreatedAt(std::string created_at);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string description);
	/*! \brief Get Board follower count.
	 */
	int getFollowerCount();

	/*! \brief Set Board follower count.
	 */
	void setFollowerCount(int follower_count);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string id);
	/*! \brief Get If set to `true`, the board will be ad-only and can store ad-only Pins.
	 */
	bool isIsAdsOnly();

	/*! \brief Set If set to `true`, the board will be ad-only and can store ad-only Pins.
	 */
	void setIsAdsOnly(bool is_ads_only);
	/*! \brief Get Board media.
	 */
	BoardMedia getMedia();

	/*! \brief Set Board media.
	 */
	void setMedia(BoardMedia media);
	/*! \brief Get     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
	 */
	std::string getName();

	/*! \brief Set     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	BoardOwner getOwner();

	/*! \brief Set 
	 */
	void setOwner(BoardOwner owner);
	/*! \brief Get Count of Pins on the board.
	 */
	int getPinCount();

	/*! \brief Set Count of Pins on the board.
	 */
	void setPinCount(int pin_count);
	/*! \brief Get 
	 */
	BoardUpdatePrivacy getPrivacy();

	/*! \brief Set 
	 */
	void setPrivacy(BoardUpdatePrivacy privacy);


    private:
    std::string board_pins_modified_at{};
    int collaborator_count{};
    std::string created_at{};
    std::string description{};
    int follower_count{};
    std::string id{};
    bool is_ads_only{};
    BoardMedia media;
    std::string name{};
    BoardOwner owner;
    int pin_count{};
    BoardUpdatePrivacy privacy;
};
}

#endif /* TINY_CPP_CLIENT_BoardWithUpdatePrivacy_H_ */
