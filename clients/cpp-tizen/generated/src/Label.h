/*
 * Label.h
 *
 * 
 */

#ifndef _Label_H_
#define _Label_H_


#include <string>
#include "LabelStatus.h"
#include "LabelType.h"
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

class Label : public Object {
public:
	/*! \brief Constructor.
	 */
	Label();
	Label(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Label();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Label ID.
	 */
	std::string getId();

	/*! \brief Set Label ID.
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	LabelType getLabelType();

	/*! \brief Set 
	 */
	void setLabelType(LabelType  label_type);
	/*! \brief Get Label parent entity ID.
	 */
	std::string getParentId();

	/*! \brief Set Label parent entity ID.
	 */
	void setParentId(std::string  parent_id);
	/*! \brief Get Label parent entity type.
	 */
	std::string getParentType();

	/*! \brief Set Label parent entity type.
	 */
	void setParentType(std::string  parent_type);
	/*! \brief Get 
	 */
	LabelStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(LabelStatus  status);
	/*! \brief Get Label name.
	 */
	std::string getValue();

	/*! \brief Set Label name.
	 */
	void setValue(std::string  value);

private:
	std::string id;
	LabelType label_type;
	std::string parent_id;
	std::string parent_type;
	LabelStatus status;
	std::string value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Label_H_ */
