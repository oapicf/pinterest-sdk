/*
 * KeywordUpdateGenerated.h
 *
 * 
 */

#ifndef _KeywordUpdateGenerated_H_
#define _KeywordUpdateGenerated_H_


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

class KeywordUpdateGenerated : public Object {
public:
	/*! \brief Constructor.
	 */
	KeywordUpdateGenerated();
	KeywordUpdateGenerated(char* str);

	/*! \brief Destructor.
	 */
	virtual ~KeywordUpdateGenerated();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Is keyword archived?
	 */
	bool getArchived();

	/*! \brief Set Is keyword archived?
	 */
	void setArchived(bool  archived);
	/*! \brief Get </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
	 */
	int getBid();

	/*! \brief Set </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
	 */
	void setBid(int  bid);
	/*! \brief Get Keyword ID.
	 */
	std::string getId();

	/*! \brief Set Keyword ID.
	 */
	void setId(std::string  id);

private:
	bool archived;
	int bid;
	std::string id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _KeywordUpdateGenerated_H_ */
