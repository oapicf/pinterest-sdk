
/*
 * BookClosed.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BookClosed_H_
#define TINY_CPP_CLIENT_BookClosed_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BookClosed{
public:

    /*! \brief Constructor.
	 */
    BookClosed();
    BookClosed(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BookClosed();


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
	void setConversionMetricsReady(bool conversion_metrics_ready);
	/*! \brief Get Are non-conversion metrics ready?
	 */
	bool isNonConversionMetricsReady();

	/*! \brief Set Are non-conversion metrics ready?
	 */
	void setNonConversionMetricsReady(bool non_conversion_metrics_ready);


    private:
    bool conversion_metrics_ready{};
    bool non_conversion_metrics_ready{};
};
}

#endif /* TINY_CPP_CLIENT_BookClosed_H_ */
