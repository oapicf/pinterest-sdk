/*
 * LabelCreateRequest_labels_inner.h
 *
 * 
 */

#ifndef _LabelCreateRequest_labels_inner_H_
#define _LabelCreateRequest_labels_inner_H_


#include <string>
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

class LabelCreateRequest_labels_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	LabelCreateRequest_labels_inner();
	LabelCreateRequest_labels_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LabelCreateRequest_labels_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	LabelType getLabelType();

	/*! \brief Set 
	 */
	void setLabelType(LabelType  label_type);
	/*! \brief Get Label name. 100-character limit.
	 */
	std::string getValue();

	/*! \brief Set Label name. 100-character limit.
	 */
	void setValue(std::string  value);

private:
	LabelType label_type;
	std::string value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LabelCreateRequest_labels_inner_H_ */
