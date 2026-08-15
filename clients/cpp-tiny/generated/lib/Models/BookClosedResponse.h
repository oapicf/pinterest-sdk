
/*
 * BookClosedResponse.h
 *
 * Creation fields
 */

#ifndef TINY_CPP_CLIENT_BookClosedResponse_H_
#define TINY_CPP_CLIENT_BookClosedResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Creation fields
 *
 *  \ingroup Models
 *
 */

class BookClosedResponse{
public:

    /*! \brief Constructor.
	 */
    BookClosedResponse();
    BookClosedResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BookClosedResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Are conversion metrics ready?
	 */
	bool isConversionMetricsReady();

	/*! \brief Set Are conversion metrics ready?
	 */
	void setConversionMetricsReady(bool  conversion_metrics_ready);
	/*! \brief Get Are non-conversion metrics ready?
	 */
	bool isNonConversionMetricsReady();

	/*! \brief Set Are non-conversion metrics ready?
	 */
	void setNonConversionMetricsReady(bool  non_conversion_metrics_ready);


    private:
    bool conversion_metrics_ready{};
    bool non_conversion_metrics_ready{};
};
}

#endif /* TINY_CPP_CLIENT_BookClosedResponse_H_ */
