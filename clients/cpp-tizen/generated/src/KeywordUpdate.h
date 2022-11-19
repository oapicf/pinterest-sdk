/*
 * KeywordUpdate.h
 *
 * 
 */

#ifndef _KeywordUpdate_H_
#define _KeywordUpdate_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class KeywordUpdate : public Object {
public:
	/*! \brief Constructor.
	 */
	KeywordUpdate();
	KeywordUpdate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~KeywordUpdate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Keyword ID.
	 */
	std::string getId();

	/*! \brief Set Keyword ID.
	 */
	void setId(std::string  id);
	/*! \brief Get Is keyword archived?
	 */
	bool getArchived();

	/*! \brief Set Is keyword archived?
	 */
	void setArchived(bool  archived);
	/*! \brief Get Keyword custom bid in microcurrency - null if inherited from parent ad group.
	 */
	int getBid();

	/*! \brief Set Keyword custom bid in microcurrency - null if inherited from parent ad group.
	 */
	void setBid(int  bid);

private:
	std::string id;
	bool archived;
	int bid;
	void __init();
	void __cleanup();

};
}
}

#endif /* _KeywordUpdate_H_ */
