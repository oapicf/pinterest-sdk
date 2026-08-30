
/*
 * TrendsEditorial.h
 *
 * Information of the published editorial article.
 */

#ifndef TINY_CPP_CLIENT_TrendsEditorial_H_
#define TINY_CPP_CLIENT_TrendsEditorial_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "KeywordInfo.h"
#include <list>

namespace Tiny {


/*! \brief Information of the published editorial article.
 *
 *  \ingroup Models
 *
 */

class TrendsEditorial{
public:

    /*! \brief Constructor.
	 */
    TrendsEditorial();
    TrendsEditorial(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TrendsEditorial();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get URL of the editorial board
	 */
	std::string getBoardUrl();

	/*! \brief Set URL of the editorial board
	 */
	void setBoardUrl(std::string board_url);
	/*! \brief Get Description of the editorial article
	 */
	std::string getDescription();

	/*! \brief Set Description of the editorial article
	 */
	void setDescription(std::string description);
	/*! \brief Get List of interests related to the editorial article
	 */
	std::list<std::string> getInterests();

	/*! \brief Set List of interests related to the editorial article
	 */
	void setInterests(std::list<std::string> interests);
	/*! \brief Get URL of the pins related to the editorial article
	 */
	std::list<std::string> getPinsUrl();

	/*! \brief Set URL of the pins related to the editorial article
	 */
	void setPinsUrl(std::list<std::string> pins_url);
	/*! \brief Get List of keywords related to the editorial article
	 */
	std::list<KeywordInfo> getRelatedKeywords();

	/*! \brief Set List of keywords related to the editorial article
	 */
	void setRelatedKeywords(std::list<KeywordInfo> related_keywords);
	/*! \brief Get Title of the editorial article
	 */
	std::string getTitle();

	/*! \brief Set Title of the editorial article
	 */
	void setTitle(std::string title);


    private:
    std::string board_url{};
    std::string description{};
    std::list<std::string> interests;
    std::list<std::string> pins_url;
    std::list<KeywordInfo> related_keywords;
    std::string title{};
};
}

#endif /* TINY_CPP_CLIENT_TrendsEditorial_H_ */
