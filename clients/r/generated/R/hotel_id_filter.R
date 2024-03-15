#' Create a new HotelIdFilter
#'
#' @description
#' HotelIdFilter Class
#'
#' @docType class
#' @title HotelIdFilter
#' @description HotelIdFilter Class
#' @format An \code{R6Class} generator object
#' @field HOTEL_ID  \link{CatalogsProductGroupMultipleStringCriteria}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
HotelIdFilter <- R6::R6Class(
  "HotelIdFilter",
  public = list(
    `HOTEL_ID` = NULL,
    #' Initialize a new HotelIdFilter class.
    #'
    #' @description
    #' Initialize a new HotelIdFilter class.
    #'
    #' @param HOTEL_ID HOTEL_ID
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`HOTEL_ID`, ...) {
      if (!missing(`HOTEL_ID`)) {
        stopifnot(R6::is.R6(`HOTEL_ID`))
        self$`HOTEL_ID` <- `HOTEL_ID`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return HotelIdFilter in JSON format
    #' @export
    toJSON = function() {
      HotelIdFilterObject <- list()
      if (!is.null(self$`HOTEL_ID`)) {
        HotelIdFilterObject[["HOTEL_ID"]] <-
          self$`HOTEL_ID`$toJSON()
      }
      HotelIdFilterObject
    },
    #' Deserialize JSON string into an instance of HotelIdFilter
    #'
    #' @description
    #' Deserialize JSON string into an instance of HotelIdFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of HotelIdFilter
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`HOTEL_ID`)) {
        `hotel_id_object` <- CatalogsProductGroupMultipleStringCriteria$new()
        `hotel_id_object`$fromJSON(jsonlite::toJSON(this_object$`HOTEL_ID`, auto_unbox = TRUE, digits = NA))
        self$`HOTEL_ID` <- `hotel_id_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return HotelIdFilter in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`HOTEL_ID`)) {
          sprintf(
          '"HOTEL_ID":
          %s
          ',
          jsonlite::toJSON(self$`HOTEL_ID`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of HotelIdFilter
    #'
    #' @description
    #' Deserialize JSON string into an instance of HotelIdFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of HotelIdFilter
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`HOTEL_ID` <- CatalogsProductGroupMultipleStringCriteria$new()$fromJSON(jsonlite::toJSON(this_object$`HOTEL_ID`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to HotelIdFilter
    #'
    #' @description
    #' Validate JSON input with respect to HotelIdFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `HOTEL_ID`
      if (!is.null(input_json$`HOTEL_ID`)) {
        stopifnot(R6::is.R6(input_json$`HOTEL_ID`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for HotelIdFilter: the required field `HOTEL_ID` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of HotelIdFilter
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      # check if the required `HOTEL_ID` is null
      if (is.null(self$`HOTEL_ID`)) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `HOTEL_ID` is null
      if (is.null(self$`HOTEL_ID`)) {
        invalid_fields["HOTEL_ID"] <- "Non-nullable required field `HOTEL_ID` cannot be null."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# HotelIdFilter$unlock()
#
## Below is an example to define the print function
# HotelIdFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# HotelIdFilter$lock()

