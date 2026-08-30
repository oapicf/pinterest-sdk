/*
 * EntityDataChangeHistory.h
 *
 * 
 */

#ifndef _EntityDataChangeHistory_H_
#define _EntityDataChangeHistory_H_


#include <string>
#include "ChangeHistoryDataType.h"
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

class EntityDataChangeHistory : public Object {
public:
	/*! \brief Constructor.
	 */
	EntityDataChangeHistory();
	EntityDataChangeHistory(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EntityDataChangeHistory();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A string identifier representing the changed field on the entity
	 */
	std::string getChangedFieldId();

	/*! \brief Set A string identifier representing the changed field on the entity
	 */
	void setChangedFieldId(std::string  changed_field_id);
	/*! \brief Get The human readable name of the changed field on the entity
	 */
	std::string getChangedFieldName();

	/*! \brief Set The human readable name of the changed field on the entity
	 */
	void setChangedFieldName(std::string  changed_field_name);
	/*! \brief Get Specifies the type of the field's data values
	 */
	ChangeHistoryDataType getDataType();

	/*! \brief Set Specifies the type of the field's data values
	 */
	void setDataType(ChangeHistoryDataType  data_type);
	/*! \brief Get A string representation of the value of the changed field, after the change
	 */
	std::string getNewDataValue();

	/*! \brief Set A string representation of the value of the changed field, after the change
	 */
	void setNewDataValue(std::string  new_data_value);
	/*! \brief Get A string representation of the value of the changed field, before the change
	 */
	std::string getOldDataValue();

	/*! \brief Set A string representation of the value of the changed field, before the change
	 */
	void setOldDataValue(std::string  old_data_value);

private:
	std::string changed_field_id;
	std::string changed_field_name;
	ChangeHistoryDataType data_type;
	std::string new_data_value;
	std::string old_data_value;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EntityDataChangeHistory_H_ */
