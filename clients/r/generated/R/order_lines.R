#' Create a new OrderLines
#'
#' @description
#' Order Line
#'
#' @docType class
#' @title OrderLines
#' @description OrderLines Class
#' @format An \code{R6Class} generator object
#' @field id Order line ID. character [optional]
#' @field type Always \"orderline\". character [optional]
#' @field ad_account_id Ad account ID. character [optional]
#' @field purchase_order_id Purchase order ID. character [optional]
#' @field start_time Start time. Unix timestamp. numeric [optional]
#' @field end_time End time. Unix timestamp. numeric [optional]
#' @field budget Order line budget in micro currency. numeric [optional]
#' @field paid_budget Order line paid budget in micro currency. numeric [optional]
#' @field status Order line status. \link{OrderLineStatus} [optional]
#' @field name Order line name. character [optional]
#' @field paid_type Order line paid type. \link{OrderLinePaidType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderLines <- R6::R6Class(
  "OrderLines",
  public = list(
    `id` = NULL,
    `type` = NULL,
    `ad_account_id` = NULL,
    `purchase_order_id` = NULL,
    `start_time` = NULL,
    `end_time` = NULL,
    `budget` = NULL,
    `paid_budget` = NULL,
    `status` = NULL,
    `name` = NULL,
    `paid_type` = NULL,

    #' @description
    #' Initialize a new OrderLines class.
    #'
    #' @param id Order line ID.
    #' @param type Always \"orderline\".
    #' @param ad_account_id Ad account ID.
    #' @param purchase_order_id Purchase order ID.
    #' @param start_time Start time. Unix timestamp.
    #' @param end_time End time. Unix timestamp.
    #' @param budget Order line budget in micro currency.
    #' @param paid_budget Order line paid budget in micro currency.
    #' @param status Order line status.
    #' @param name Order line name.
    #' @param paid_type Order line paid type.
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `type` = NULL, `ad_account_id` = NULL, `purchase_order_id` = NULL, `start_time` = NULL, `end_time` = NULL, `budget` = NULL, `paid_budget` = NULL, `status` = NULL, `name` = NULL, `paid_type` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`type`)) {
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
      if (!is.null(`purchase_order_id`)) {
        if (!(is.character(`purchase_order_id`) && length(`purchase_order_id`) == 1)) {
          stop(paste("Error! Invalid data for `purchase_order_id`. Must be a string:", `purchase_order_id`))
        }
        self$`purchase_order_id` <- `purchase_order_id`
      }
      if (!is.null(`start_time`)) {
        self$`start_time` <- `start_time`
      }
      if (!is.null(`end_time`)) {
        self$`end_time` <- `end_time`
      }
      if (!is.null(`budget`)) {
        self$`budget` <- `budget`
      }
      if (!is.null(`paid_budget`)) {
        self$`paid_budget` <- `paid_budget`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`paid_type`)) {
        if (!(`paid_type` %in% c())) {
          stop(paste("Error! \"", `paid_type`, "\" cannot be assigned to `paid_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`paid_type`))
        self$`paid_type` <- `paid_type`
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
    #' @return OrderLines as a base R list.
    #' @examples
    #' # convert array of OrderLines (x) to a data frame
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
    #' Convert OrderLines to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      OrderLinesObject <- list()
      if (!is.null(self$`id`)) {
        OrderLinesObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`type`)) {
        OrderLinesObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`ad_account_id`)) {
        OrderLinesObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`purchase_order_id`)) {
        OrderLinesObject[["purchase_order_id"]] <-
          self$`purchase_order_id`
      }
      if (!is.null(self$`start_time`)) {
        OrderLinesObject[["start_time"]] <-
          self$`start_time`
      }
      if (!is.null(self$`end_time`)) {
        OrderLinesObject[["end_time"]] <-
          self$`end_time`
      }
      if (!is.null(self$`budget`)) {
        OrderLinesObject[["budget"]] <-
          self$`budget`
      }
      if (!is.null(self$`paid_budget`)) {
        OrderLinesObject[["paid_budget"]] <-
          self$`paid_budget`
      }
      if (!is.null(self$`status`)) {
        OrderLinesObject[["status"]] <-
          self$`status`$toSimpleType()
      }
      if (!is.null(self$`name`)) {
        OrderLinesObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`paid_type`)) {
        OrderLinesObject[["paid_type"]] <-
          self$`paid_type`$toSimpleType()
      }
      return(OrderLinesObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of OrderLines
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderLines
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`purchase_order_id`)) {
        self$`purchase_order_id` <- this_object$`purchase_order_id`
      }
      if (!is.null(this_object$`start_time`)) {
        self$`start_time` <- this_object$`start_time`
      }
      if (!is.null(this_object$`end_time`)) {
        self$`end_time` <- this_object$`end_time`
      }
      if (!is.null(this_object$`budget`)) {
        self$`budget` <- this_object$`budget`
      }
      if (!is.null(this_object$`paid_budget`)) {
        self$`paid_budget` <- this_object$`paid_budget`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- OrderLineStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`paid_type`)) {
        `paid_type_object` <- OrderLinePaidType$new()
        `paid_type_object`$fromJSON(jsonlite::toJSON(this_object$`paid_type`, auto_unbox = TRUE, digits = NA))
        self$`paid_type` <- `paid_type_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return OrderLines in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of OrderLines
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderLines
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`type` <- this_object$`type`
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`purchase_order_id` <- this_object$`purchase_order_id`
      self$`start_time` <- this_object$`start_time`
      self$`end_time` <- this_object$`end_time`
      self$`budget` <- this_object$`budget`
      self$`paid_budget` <- this_object$`paid_budget`
      self$`status` <- OrderLineStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`name` <- this_object$`name`
      self$`paid_type` <- OrderLinePaidType$new()$fromJSON(jsonlite::toJSON(this_object$`paid_type`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to OrderLines and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OrderLines
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

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
# OrderLines$unlock()
#
## Below is an example to define the print function
# OrderLines$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderLines$lock()

