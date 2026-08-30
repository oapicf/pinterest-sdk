
/*
 * TimeSeries.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TimeSeries_H_
#define TINY_CPP_CLIENT_TimeSeries_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"
#include <map>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TimeSeries{
public:

    /*! \brief Constructor.
	 */
    TimeSeries();
    TimeSeries(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TimeSeries();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	Date getDate();

	/*! \brief Set 
	 */
	void setDate(Date date);


    private:
    Date date;
};
}

#endif /* TINY_CPP_CLIENT_TimeSeries_H_ */
