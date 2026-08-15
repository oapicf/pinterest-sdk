
/*
 * BoardWithUpdatePrivacyUpdate.h
 *
 * Resource create or update operation model.
 */

#ifndef TINY_CPP_CLIENT_BoardWithUpdatePrivacyUpdate_H_
#define TINY_CPP_CLIENT_BoardWithUpdatePrivacyUpdate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BoardUpdatePrivacy.h"

namespace Tiny {


/*! \brief Resource create or update operation model.
 *
 *  \ingroup Models
 *
 */

class BoardWithUpdatePrivacyUpdate{
public:

    /*! \brief Constructor.
	 */
    BoardWithUpdatePrivacyUpdate();
    BoardWithUpdatePrivacyUpdate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BoardWithUpdatePrivacyUpdate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
	 */
	std::string getName();

	/*! \brief Set      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	BoardUpdatePrivacy getPrivacy();

	/*! \brief Set 
	 */
	void setPrivacy(BoardUpdatePrivacy  privacy);


    private:
    std::string description{};
    std::string name{};
    BoardUpdatePrivacy privacy;
};
}

#endif /* TINY_CPP_CLIENT_BoardWithUpdatePrivacyUpdate_H_ */
