#' Create a new QualityComponents
#'
#' @description
#' Set of quality components, with each component containing a event coverage and details.
#'
#' @docType class
#' @title QualityComponents
#' @description QualityComponents Class
#' @format An \code{R6Class} generator object
#' @field advertiser_external_id  named list(\link{QualityComponentDetails}) [optional]
#' @field click_id_epik  named list(\link{QualityComponentDetails}) [optional]
#' @field external_event_id Dedup components. named list(\link{QualityComponentDetails}) [optional]
#' @field hashed_email User matching identifiers. named list(\link{QualityComponentDetails}) [optional]
#' @field hashed_maid  named list(\link{QualityComponentDetails}) [optional]
#' @field ip_address  named list(\link{QualityComponentDetails}) [optional]
#' @field order_id  named list(\link{QualityComponentDetails}) [optional]
#' @field order_value  named list(\link{QualityComponentDetails}) [optional]
#' @field product_id Product/event metadata. named list(\link{QualityComponentDetails}) [optional]
#' @field source_url  named list(\link{QualityComponentDetails}) [optional]
#' @field user_agent  named list(\link{QualityComponentDetails}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
QualityComponents <- R6::R6Class(
  "QualityComponents",
  public = list(
    `advertiser_external_id` = NULL,
    `click_id_epik` = NULL,
    `external_event_id` = NULL,
    `hashed_email` = NULL,
    `hashed_maid` = NULL,
    `ip_address` = NULL,
    `order_id` = NULL,
    `order_value` = NULL,
    `product_id` = NULL,
    `source_url` = NULL,
    `user_agent` = NULL,

    #' @description
    #' Initialize a new QualityComponents class.
    #'
    #' @param advertiser_external_id advertiser_external_id
    #' @param click_id_epik click_id_epik
    #' @param external_event_id Dedup components.
    #' @param hashed_email User matching identifiers.
    #' @param hashed_maid hashed_maid
    #' @param ip_address ip_address
    #' @param order_id order_id
    #' @param order_value order_value
    #' @param product_id Product/event metadata.
    #' @param source_url source_url
    #' @param user_agent user_agent
    #' @param ... Other optional arguments.
    initialize = function(`advertiser_external_id` = NULL, `click_id_epik` = NULL, `external_event_id` = NULL, `hashed_email` = NULL, `hashed_maid` = NULL, `ip_address` = NULL, `order_id` = NULL, `order_value` = NULL, `product_id` = NULL, `source_url` = NULL, `user_agent` = NULL, ...) {
      if (!is.null(`advertiser_external_id`)) {
        stopifnot(is.vector(`advertiser_external_id`), length(`advertiser_external_id`) != 0)
        sapply(`advertiser_external_id`, function(x) stopifnot(R6::is.R6(x)))
        self$`advertiser_external_id` <- `advertiser_external_id`
      }
      if (!is.null(`click_id_epik`)) {
        stopifnot(is.vector(`click_id_epik`), length(`click_id_epik`) != 0)
        sapply(`click_id_epik`, function(x) stopifnot(R6::is.R6(x)))
        self$`click_id_epik` <- `click_id_epik`
      }
      if (!is.null(`external_event_id`)) {
        stopifnot(is.vector(`external_event_id`), length(`external_event_id`) != 0)
        sapply(`external_event_id`, function(x) stopifnot(R6::is.R6(x)))
        self$`external_event_id` <- `external_event_id`
      }
      if (!is.null(`hashed_email`)) {
        stopifnot(is.vector(`hashed_email`), length(`hashed_email`) != 0)
        sapply(`hashed_email`, function(x) stopifnot(R6::is.R6(x)))
        self$`hashed_email` <- `hashed_email`
      }
      if (!is.null(`hashed_maid`)) {
        stopifnot(is.vector(`hashed_maid`), length(`hashed_maid`) != 0)
        sapply(`hashed_maid`, function(x) stopifnot(R6::is.R6(x)))
        self$`hashed_maid` <- `hashed_maid`
      }
      if (!is.null(`ip_address`)) {
        stopifnot(is.vector(`ip_address`), length(`ip_address`) != 0)
        sapply(`ip_address`, function(x) stopifnot(R6::is.R6(x)))
        self$`ip_address` <- `ip_address`
      }
      if (!is.null(`order_id`)) {
        stopifnot(is.vector(`order_id`), length(`order_id`) != 0)
        sapply(`order_id`, function(x) stopifnot(R6::is.R6(x)))
        self$`order_id` <- `order_id`
      }
      if (!is.null(`order_value`)) {
        stopifnot(is.vector(`order_value`), length(`order_value`) != 0)
        sapply(`order_value`, function(x) stopifnot(R6::is.R6(x)))
        self$`order_value` <- `order_value`
      }
      if (!is.null(`product_id`)) {
        stopifnot(is.vector(`product_id`), length(`product_id`) != 0)
        sapply(`product_id`, function(x) stopifnot(R6::is.R6(x)))
        self$`product_id` <- `product_id`
      }
      if (!is.null(`source_url`)) {
        stopifnot(is.vector(`source_url`), length(`source_url`) != 0)
        sapply(`source_url`, function(x) stopifnot(R6::is.R6(x)))
        self$`source_url` <- `source_url`
      }
      if (!is.null(`user_agent`)) {
        stopifnot(is.vector(`user_agent`), length(`user_agent`) != 0)
        sapply(`user_agent`, function(x) stopifnot(R6::is.R6(x)))
        self$`user_agent` <- `user_agent`
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
    #' @return QualityComponents as a base R list.
    #' @examples
    #' # convert array of QualityComponents (x) to a data frame
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
    #' Convert QualityComponents to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      QualityComponentsObject <- list()
      if (!is.null(self$`advertiser_external_id`)) {
        QualityComponentsObject[["advertiser_external_id"]] <-
          lapply(self$`advertiser_external_id`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`click_id_epik`)) {
        QualityComponentsObject[["click_id_epik"]] <-
          lapply(self$`click_id_epik`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`external_event_id`)) {
        QualityComponentsObject[["external_event_id"]] <-
          lapply(self$`external_event_id`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`hashed_email`)) {
        QualityComponentsObject[["hashed_email"]] <-
          lapply(self$`hashed_email`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`hashed_maid`)) {
        QualityComponentsObject[["hashed_maid"]] <-
          lapply(self$`hashed_maid`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`ip_address`)) {
        QualityComponentsObject[["ip_address"]] <-
          lapply(self$`ip_address`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`order_id`)) {
        QualityComponentsObject[["order_id"]] <-
          lapply(self$`order_id`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`order_value`)) {
        QualityComponentsObject[["order_value"]] <-
          lapply(self$`order_value`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`product_id`)) {
        QualityComponentsObject[["product_id"]] <-
          lapply(self$`product_id`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`source_url`)) {
        QualityComponentsObject[["source_url"]] <-
          lapply(self$`source_url`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`user_agent`)) {
        QualityComponentsObject[["user_agent"]] <-
          lapply(self$`user_agent`, function(x) x$toSimpleType())
      }
      return(QualityComponentsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of QualityComponents
    #'
    #' @param input_json the JSON input
    #' @return the instance of QualityComponents
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`advertiser_external_id`)) {
        self$`advertiser_external_id` <- ApiClient$new()$deserializeObj(this_object$`advertiser_external_id`, "map(QualityComponentDetails)", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`click_id_epik`)) {
        self$`click_id_epik` <- ApiClient$new()$deserializeObj(this_object$`click_id_epik`, "map(QualityComponentDetails)", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`external_event_id`)) {
        self$`external_event_id` <- ApiClient$new()$deserializeObj(this_object$`external_event_id`, "map(QualityComponentDetails)", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`hashed_email`)) {
        self$`hashed_email` <- ApiClient$new()$deserializeObj(this_object$`hashed_email`, "map(QualityComponentDetails)", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`hashed_maid`)) {
        self$`hashed_maid` <- ApiClient$new()$deserializeObj(this_object$`hashed_maid`, "map(QualityComponentDetails)", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`ip_address`)) {
        self$`ip_address` <- ApiClient$new()$deserializeObj(this_object$`ip_address`, "map(QualityComponentDetails)", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`order_id`)) {
        self$`order_id` <- ApiClient$new()$deserializeObj(this_object$`order_id`, "map(QualityComponentDetails)", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`order_value`)) {
        self$`order_value` <- ApiClient$new()$deserializeObj(this_object$`order_value`, "map(QualityComponentDetails)", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`product_id`)) {
        self$`product_id` <- ApiClient$new()$deserializeObj(this_object$`product_id`, "map(QualityComponentDetails)", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`source_url`)) {
        self$`source_url` <- ApiClient$new()$deserializeObj(this_object$`source_url`, "map(QualityComponentDetails)", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`user_agent`)) {
        self$`user_agent` <- ApiClient$new()$deserializeObj(this_object$`user_agent`, "map(QualityComponentDetails)", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return QualityComponents in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of QualityComponents
    #'
    #' @param input_json the JSON input
    #' @return the instance of QualityComponents
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`advertiser_external_id` <- ApiClient$new()$deserializeObj(this_object$`advertiser_external_id`, "map(QualityComponentDetails)", loadNamespace("openapi"))
      self$`click_id_epik` <- ApiClient$new()$deserializeObj(this_object$`click_id_epik`, "map(QualityComponentDetails)", loadNamespace("openapi"))
      self$`external_event_id` <- ApiClient$new()$deserializeObj(this_object$`external_event_id`, "map(QualityComponentDetails)", loadNamespace("openapi"))
      self$`hashed_email` <- ApiClient$new()$deserializeObj(this_object$`hashed_email`, "map(QualityComponentDetails)", loadNamespace("openapi"))
      self$`hashed_maid` <- ApiClient$new()$deserializeObj(this_object$`hashed_maid`, "map(QualityComponentDetails)", loadNamespace("openapi"))
      self$`ip_address` <- ApiClient$new()$deserializeObj(this_object$`ip_address`, "map(QualityComponentDetails)", loadNamespace("openapi"))
      self$`order_id` <- ApiClient$new()$deserializeObj(this_object$`order_id`, "map(QualityComponentDetails)", loadNamespace("openapi"))
      self$`order_value` <- ApiClient$new()$deserializeObj(this_object$`order_value`, "map(QualityComponentDetails)", loadNamespace("openapi"))
      self$`product_id` <- ApiClient$new()$deserializeObj(this_object$`product_id`, "map(QualityComponentDetails)", loadNamespace("openapi"))
      self$`source_url` <- ApiClient$new()$deserializeObj(this_object$`source_url`, "map(QualityComponentDetails)", loadNamespace("openapi"))
      self$`user_agent` <- ApiClient$new()$deserializeObj(this_object$`user_agent`, "map(QualityComponentDetails)", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to QualityComponents and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of QualityComponents
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
# QualityComponents$unlock()
#
## Below is an example to define the print function
# QualityComponents$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# QualityComponents$lock()

