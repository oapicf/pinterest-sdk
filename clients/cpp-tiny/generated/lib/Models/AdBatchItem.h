
/*
 * AdBatchItem.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdBatchItem_H_
#define TINY_CPP_CLIENT_AdBatchItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Ad.h"
#include "Pinterest.Lib.Error.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdBatchItem{
public:

    /*! \brief Constructor.
	 */
    AdBatchItem();
    AdBatchItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdBatchItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Ad getData();

	/*! \brief Set 
	 */
	void setData(Ad data);
	/*! \brief Get 
	 */
	Pinterest.Lib.Error getExceptions();

	/*! \brief Set 
	 */
	void setExceptions(Pinterest.Lib.Error exceptions);


    private:
    Ad data;
    Pinterest.Lib.Error exceptions;
};
}

#endif /* TINY_CPP_CLIENT_AdBatchItem_H_ */
