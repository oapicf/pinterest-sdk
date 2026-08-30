
/*
 * AdBatchWriteResponseModel.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdBatchWriteResponseModel_H_
#define TINY_CPP_CLIENT_AdBatchWriteResponseModel_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdBatchItem.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdBatchWriteResponseModel{
public:

    /*! \brief Constructor.
	 */
    AdBatchWriteResponseModel();
    AdBatchWriteResponseModel(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdBatchWriteResponseModel();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<AdBatchItem> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list<AdBatchItem> items);


    private:
    std::list<AdBatchItem> items;
};
}

#endif /* TINY_CPP_CLIENT_AdBatchWriteResponseModel_H_ */
