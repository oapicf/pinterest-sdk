/*
 * Label.h
 *
 * 
 */

#ifndef _Label_H_
#define _Label_H_


#include <string>
#include "NullableLabelStatus.h"
#include "NullableLabelType.h"
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
	NullableLabelType getLabelType();

	/*! \brief Set 
	 */
	void setLabelType(NullableLabelType  label_type);
	/*! \brief Get 
	 */
	NullableLabelStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(NullableLabelStatus  status);
	/*! \brief Get Label name. 100-character limit.
	 */
	std::string getValue();

	/*! \brief Set Label name. 100-character limit.
	 */
	void setValue(std::string  value);

private:
	std::string id;
	NullableLabelType label_type;
	NullableLabelStatus status;
	std::string value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Label_H_ */
