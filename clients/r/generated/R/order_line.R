#' Create a new OrderLine
#'
#' @description
#' OrderLine Class
#'
#' @docType class
#' @title OrderLine
#' @description OrderLine Class
#' @format An \code{R6Class} generator object
#' @field ad_account_id Ad account ID. character
#' @field budget Order line budget in micro currency. numeric [optional]
#' @field campaign_ids Associated List of campaign IDs. list(character)
#' @field end_time End time. Unix timestamp. numeric [optional]
#' @field id Order line ID. character
#' @field name Order line name. character [optional]
#' @field paid_budget Order line paid budget in micro currency. numeric [optional]
#' @field paid_type Order line paid type. \link{OrderLinePaidType} [optional]
#' @field purchase_order_id Purchase order ID. character [optional]
#' @field start_time Start time. Unix timestamp. numeric [optional]
#' @field status Order line status. \link{OrderLineStatus}
#' @field type Always \"orderline\". character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderLine <- R6::R6Class(
  "OrderLine",
  public = list(
    `ad_account_id` = NULL,
    `budget` = NULL,
    `campaign_ids` = NULL,
    `end_time` = NULL,
    `id` = NULL,
    `name` = NULL,
    `paid_budget` = NULL,
    `paid_type` = NULL,
    `purchase_order_id` = NULL,
    `start_time` = NULL,
    `status` = NULL,
    `type` = NULL,

    #' @description
    #' Initialize a new OrderLine class.
    #'
    #' @param ad_account_id Ad account ID.
    #' @param campaign_ids Associated List of campaign IDs.
    #' @param id Order line ID.
    #' @param status Order line status.
    #' @param type Always \"orderline\".
    #' @param budget Order line budget in micro currency.
    #' @param end_time End time. Unix timestamp.
    #' @param name Order line name.
    #' @param paid_budget Order line paid budget in micro currency.
    #' @param paid_type Order line paid type.
    #' @param purchase_order_id Purchase order ID.
    #' @param start_time Start time. Unix timestamp.
    #' @param ... Other optional arguments.
    initialize = function(`ad_account_id`, `campaign_ids`, `id`, `status`, `type`, `budget` = NULL, `end_time` = NULL, `name` = NULL, `paid_budget` = NULL, `paid_type` = NULL, `purchase_order_id` = NULL, `start_time` = NULL, ...) {
      if (!missing(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
      if (!missing(`campaign_ids`)) {
        stopifnot(is.vector(`campaign_ids`), length(`campaign_ids`) != 0)
        sapply(`campaign_ids`, function(x) stopifnot(is.character(x)))
        self$`campaign_ids` <- `campaign_ids`
      }
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!missing(`type`)) {
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`budget`)) {
        self$`budget` <- `budget`
      }
      if (!is.null(`end_time`)) {
        self$`end_time` <- `end_time`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`paid_budget`)) {
        self$`paid_budget` <- `paid_budget`
      }
      if (!is.null(`paid_type`)) {
        if (!(`paid_type` %in% c())) {
          stop(paste("Error! \"", `paid_type`, "\" cannot be assigned to `paid_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`paid_type`))
        self$`paid_type` <- `paid_type`
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
    #' @return OrderLine as a base R list.
    #' @examples
    #' # convert array of OrderLine (x) to a data frame
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
    #' Convert OrderLine to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      OrderLineObject <- list()
      if (!is.null(self$`ad_account_id`)) {
        OrderLineObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`budget`)) {
        OrderLineObject[["budget"]] <-
          self$`budget`
      }
      if (!is.null(self$`campaign_ids`)) {
        OrderLineObject[["campaign_ids"]] <-
          self$`campaign_ids`
      }
      if (!is.null(self$`end_time`)) {
        OrderLineObject[["end_time"]] <-
          self$`end_time`
      }
      if (!is.null(self$`id`)) {
        OrderLineObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        OrderLineObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`paid_budget`)) {
        OrderLineObject[["paid_budget"]] <-
          self$`paid_budget`
      }
      if (!is.null(self$`paid_type`)) {
        OrderLineObject[["paid_type"]] <-
          self$extractSimpleType(self$`paid_type`)
      }
      if (!is.null(self$`purchase_order_id`)) {
        OrderLineObject[["purchase_order_id"]] <-
          self$`purchase_order_id`
      }
      if (!is.null(self$`start_time`)) {
        OrderLineObject[["start_time"]] <-
          self$`start_time`
      }
      if (!is.null(self$`status`)) {
        OrderLineObject[["status"]] <-
          self$extractSimpleType(self$`status`)
      }
      if (!is.null(self$`type`)) {
        OrderLineObject[["type"]] <-
          self$`type`
      }
      return(OrderLineObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of OrderLine
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderLine
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`budget`)) {
        self$`budget` <- this_object$`budget`
      }
      if (!is.null(this_object$`campaign_ids`)) {
        self$`campaign_ids` <- ApiClient$new()$deserializeObj(this_object$`campaign_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`end_time`)) {
        self$`end_time` <- this_object$`end_time`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`paid_budget`)) {
        self$`paid_budget` <- this_object$`paid_budget`
      }
      if (!is.null(this_object$`paid_type`)) {
        `paid_type_object` <- OrderLinePaidType$new()
        `paid_type_object`$fromJSON(jsonlite::toJSON(this_object$`paid_type`, auto_unbox = TRUE, digits = NA))
        self$`paid_type` <- `paid_type_object`
      }
      if (!is.null(this_object$`purchase_order_id`)) {
        self$`purchase_order_id` <- this_object$`purchase_order_id`
      }
      if (!is.null(this_object$`start_time`)) {
        self$`start_time` <- this_object$`start_time`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- OrderLineStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return OrderLine in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of OrderLine
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderLine
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`budget` <- this_object$`budget`
      self$`campaign_ids` <- ApiClient$new()$deserializeObj(this_object$`campaign_ids`, "array[character]", loadNamespace("openapi"))
      self$`end_time` <- this_object$`end_time`
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`paid_budget` <- this_object$`paid_budget`
      self$`paid_type` <- OrderLinePaidType$new()$fromJSON(jsonlite::toJSON(this_object$`paid_type`, auto_unbox = TRUE, digits = NA))
      self$`purchase_order_id` <- this_object$`purchase_order_id`
      self$`start_time` <- this_object$`start_time`
      self$`status` <- OrderLineStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`type` <- this_object$`type`
      self
    },

    #' @description
    #' Validate JSON input with respect to OrderLine and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `ad_account_id`
      if (!is.null(input_json$`ad_account_id`)) {
        if (!(is.character(input_json$`ad_account_id`) && length(input_json$`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", input_json$`ad_account_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrderLine: the required field `ad_account_id` is missing."))
      }
      # check the required field `campaign_ids`
      if (!is.null(input_json$`campaign_ids`)) {
        stopifnot(is.vector(input_json$`campaign_ids`), length(input_json$`campaign_ids`) != 0)
        tmp <- sapply(input_json$`campaign_ids`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrderLine: the required field `campaign_ids` is missing."))
      }
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrderLine: the required field `id` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        stopifnot(R6::is.R6(input_json$`status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrderLine: the required field `status` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OrderLine: the required field `type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OrderLine
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `ad_account_id` is null
      if (is.null(self$`ad_account_id`)) {
        return(FALSE)
      }

      # check if the required `campaign_ids` is null
      if (is.null(self$`campaign_ids`)) {
        return(FALSE)
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        return(FALSE)
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
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
      # check if the required `ad_account_id` is null
      if (is.null(self$`ad_account_id`)) {
        invalid_fields["ad_account_id"] <- "Non-nullable required field `ad_account_id` cannot be null."
      }

      # check if the required `campaign_ids` is null
      if (is.null(self$`campaign_ids`)) {
        invalid_fields["campaign_ids"] <- "Non-nullable required field `campaign_ids` cannot be null."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
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
# OrderLine$unlock()
#
## Below is an example to define the print function
# OrderLine$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderLine$lock()

