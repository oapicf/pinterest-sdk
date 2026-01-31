#' Create a new AdvertiserDefinedEvent
#'
#' @description
#' AdvertiserDefinedEvent Class
#'
#' @docType class
#' @title AdvertiserDefinedEvent
#' @description AdvertiserDefinedEvent Class
#' @format An \code{R6Class} generator object
#' @field name raw string name of the event, usually logged as raw_event_name in our dataset character [optional]
#' @field mapped_conversion_type standard type mapped to ADE for optimization character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdvertiserDefinedEvent <- R6::R6Class(
  "AdvertiserDefinedEvent",
  public = list(
    `name` = NULL,
    `mapped_conversion_type` = NULL,

    #' @description
    #' Initialize a new AdvertiserDefinedEvent class.
    #'
    #' @param name raw string name of the event, usually logged as raw_event_name in our dataset
    #' @param mapped_conversion_type standard type mapped to ADE for optimization
    #' @param ... Other optional arguments.
    initialize = function(`name` = NULL, `mapped_conversion_type` = NULL, ...) {
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`mapped_conversion_type`)) {
        if (!(`mapped_conversion_type` %in% c("PAGE_LOAD", "UNKNOWN", "INITIALIZED", "PAGE_VISIT", "SIGNUP", "CHECKOUT", "CUSTOM", "VIEW_CATEGORY", "SEARCH", "ADD_TO_CART", "WATCH_VIDEO", "LEAD", "APP_INSTALL", "WEB_SESSION", "EXTERNAL_MEASUREMENT", "ADD_PAYMENT_INFO", "ADD_TO_WISHLIST", "INITIATE_CHECKOUT", "SUBSCRIBE", "VIEW_CONTENT", "ADVERTISER_DEFINED_EVENT", "APP_OPEN", "CONTACT", "SCHEDULE", "FIND_LOCATION", "CUSTOMIZE_PRODUCT", "SUBMIT_APPLICATION", "START_TRIAL"))) {
          stop(paste("Error! \"", `mapped_conversion_type`, "\" cannot be assigned to `mapped_conversion_type`. Must be \"PAGE_LOAD\", \"UNKNOWN\", \"INITIALIZED\", \"PAGE_VISIT\", \"SIGNUP\", \"CHECKOUT\", \"CUSTOM\", \"VIEW_CATEGORY\", \"SEARCH\", \"ADD_TO_CART\", \"WATCH_VIDEO\", \"LEAD\", \"APP_INSTALL\", \"WEB_SESSION\", \"EXTERNAL_MEASUREMENT\", \"ADD_PAYMENT_INFO\", \"ADD_TO_WISHLIST\", \"INITIATE_CHECKOUT\", \"SUBSCRIBE\", \"VIEW_CONTENT\", \"ADVERTISER_DEFINED_EVENT\", \"APP_OPEN\", \"CONTACT\", \"SCHEDULE\", \"FIND_LOCATION\", \"CUSTOMIZE_PRODUCT\", \"SUBMIT_APPLICATION\", \"START_TRIAL\".", sep = ""))
        }
        if (!(is.character(`mapped_conversion_type`) && length(`mapped_conversion_type`) == 1)) {
          stop(paste("Error! Invalid data for `mapped_conversion_type`. Must be a string:", `mapped_conversion_type`))
        }
        self$`mapped_conversion_type` <- `mapped_conversion_type`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return AdvertiserDefinedEvent as a base R list.
    #' @examples
    #' # convert array of AdvertiserDefinedEvent (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert AdvertiserDefinedEvent to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdvertiserDefinedEventObject <- list()
      if (!is.null(self$`name`)) {
        AdvertiserDefinedEventObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`mapped_conversion_type`)) {
        AdvertiserDefinedEventObject[["mapped_conversion_type"]] <-
          self$`mapped_conversion_type`
      }
      return(AdvertiserDefinedEventObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdvertiserDefinedEvent
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdvertiserDefinedEvent
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`mapped_conversion_type`)) {
        if (!is.null(this_object$`mapped_conversion_type`) && !(this_object$`mapped_conversion_type` %in% c("PAGE_LOAD", "UNKNOWN", "INITIALIZED", "PAGE_VISIT", "SIGNUP", "CHECKOUT", "CUSTOM", "VIEW_CATEGORY", "SEARCH", "ADD_TO_CART", "WATCH_VIDEO", "LEAD", "APP_INSTALL", "WEB_SESSION", "EXTERNAL_MEASUREMENT", "ADD_PAYMENT_INFO", "ADD_TO_WISHLIST", "INITIATE_CHECKOUT", "SUBSCRIBE", "VIEW_CONTENT", "ADVERTISER_DEFINED_EVENT", "APP_OPEN", "CONTACT", "SCHEDULE", "FIND_LOCATION", "CUSTOMIZE_PRODUCT", "SUBMIT_APPLICATION", "START_TRIAL"))) {
          stop(paste("Error! \"", this_object$`mapped_conversion_type`, "\" cannot be assigned to `mapped_conversion_type`. Must be \"PAGE_LOAD\", \"UNKNOWN\", \"INITIALIZED\", \"PAGE_VISIT\", \"SIGNUP\", \"CHECKOUT\", \"CUSTOM\", \"VIEW_CATEGORY\", \"SEARCH\", \"ADD_TO_CART\", \"WATCH_VIDEO\", \"LEAD\", \"APP_INSTALL\", \"WEB_SESSION\", \"EXTERNAL_MEASUREMENT\", \"ADD_PAYMENT_INFO\", \"ADD_TO_WISHLIST\", \"INITIATE_CHECKOUT\", \"SUBSCRIBE\", \"VIEW_CONTENT\", \"ADVERTISER_DEFINED_EVENT\", \"APP_OPEN\", \"CONTACT\", \"SCHEDULE\", \"FIND_LOCATION\", \"CUSTOMIZE_PRODUCT\", \"SUBMIT_APPLICATION\", \"START_TRIAL\".", sep = ""))
        }
        self$`mapped_conversion_type` <- this_object$`mapped_conversion_type`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdvertiserDefinedEvent in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdvertiserDefinedEvent
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdvertiserDefinedEvent
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      if (!is.null(this_object$`mapped_conversion_type`) && !(this_object$`mapped_conversion_type` %in% c("PAGE_LOAD", "UNKNOWN", "INITIALIZED", "PAGE_VISIT", "SIGNUP", "CHECKOUT", "CUSTOM", "VIEW_CATEGORY", "SEARCH", "ADD_TO_CART", "WATCH_VIDEO", "LEAD", "APP_INSTALL", "WEB_SESSION", "EXTERNAL_MEASUREMENT", "ADD_PAYMENT_INFO", "ADD_TO_WISHLIST", "INITIATE_CHECKOUT", "SUBSCRIBE", "VIEW_CONTENT", "ADVERTISER_DEFINED_EVENT", "APP_OPEN", "CONTACT", "SCHEDULE", "FIND_LOCATION", "CUSTOMIZE_PRODUCT", "SUBMIT_APPLICATION", "START_TRIAL"))) {
        stop(paste("Error! \"", this_object$`mapped_conversion_type`, "\" cannot be assigned to `mapped_conversion_type`. Must be \"PAGE_LOAD\", \"UNKNOWN\", \"INITIALIZED\", \"PAGE_VISIT\", \"SIGNUP\", \"CHECKOUT\", \"CUSTOM\", \"VIEW_CATEGORY\", \"SEARCH\", \"ADD_TO_CART\", \"WATCH_VIDEO\", \"LEAD\", \"APP_INSTALL\", \"WEB_SESSION\", \"EXTERNAL_MEASUREMENT\", \"ADD_PAYMENT_INFO\", \"ADD_TO_WISHLIST\", \"INITIATE_CHECKOUT\", \"SUBSCRIBE\", \"VIEW_CONTENT\", \"ADVERTISER_DEFINED_EVENT\", \"APP_OPEN\", \"CONTACT\", \"SCHEDULE\", \"FIND_LOCATION\", \"CUSTOMIZE_PRODUCT\", \"SUBMIT_APPLICATION\", \"START_TRIAL\".", sep = ""))
      }
      self$`mapped_conversion_type` <- this_object$`mapped_conversion_type`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdvertiserDefinedEvent and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdvertiserDefinedEvent
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# AdvertiserDefinedEvent$unlock()
#
## Below is an example to define the print function
# AdvertiserDefinedEvent$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdvertiserDefinedEvent$lock()

