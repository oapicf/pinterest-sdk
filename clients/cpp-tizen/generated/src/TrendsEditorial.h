/*
 * TrendsEditorial.h
 *
 * Information of the published editorial article.
 */

#ifndef _TrendsEditorial_H_
#define _TrendsEditorial_H_


#include <string>
#include "KeywordInfo.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Information of the published editorial article.
 *
 *  \ingroup Models
 *
 */

class TrendsEditorial : public Object {
public:
	/*! \brief Constructor.
	 */
	TrendsEditorial();
	TrendsEditorial(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TrendsEditorial();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get URL of the editorial board
	 */
	std::string getBoardUrl();

	/*! \brief Set URL of the editorial board
	 */
	void setBoardUrl(std::string  board_url);
	/*! \brief Get Description of the editorial article
	 */
	std::string getDescription();

	/*! \brief Set Description of the editorial article
	 */
	void setDescription(std::string  description);
	/*! \brief Get List of interests related to the editorial article
	 */
	std::list<std::string> getInterests();

	/*! \brief Set List of interests related to the editorial article
	 */
	void setInterests(std::list <std::string> interests);
	/*! \brief Get URL of the pins related to the editorial article
	 */
	std::list<std::string> getPinsUrl();

	/*! \brief Set URL of the pins related to the editorial article
	 */
	void setPinsUrl(std::list <std::string> pins_url);
	/*! \brief Get List of keywords related to the editorial article
	 */
	std::list<KeywordInfo> getRelatedKeywords();

	/*! \brief Set List of keywords related to the editorial article
	 */
	void setRelatedKeywords(std::list <KeywordInfo> related_keywords);
	/*! \brief Get Title of the editorial article
	 */
	std::string getTitle();

	/*! \brief Set Title of the editorial article
	 */
	void setTitle(std::string  title);

private:
	std::string board_url;
	std::string description;
	std::list <std::string>interests;
	std::list <std::string>pins_url;
	std::list <KeywordInfo>related_keywords;
	std::string title;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TrendsEditorial_H_ */
