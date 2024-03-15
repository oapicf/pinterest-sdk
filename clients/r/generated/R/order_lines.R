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
    #' Initialize a new OrderLines class.
    #'
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
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderLines in JSON format
    #' @export
    toJSON = function() {
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
          self$`status`$toJSON()
      }
      if (!is.null(self$`name`)) {
        OrderLinesObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`paid_type`)) {
        OrderLinesObject[["paid_type"]] <-
          self$`paid_type`$toJSON()
      }
      OrderLinesObject
    },
    #' Deserialize JSON string into an instance of OrderLines
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderLines
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderLines
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return OrderLines in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
            "%s"
                    ',
          self$`type`
          )
        },
        if (!is.null(self$`ad_account_id`)) {
          sprintf(
          '"ad_account_id":
            "%s"
                    ',
          self$`ad_account_id`
          )
        },
        if (!is.null(self$`purchase_order_id`)) {
          sprintf(
          '"purchase_order_id":
            "%s"
                    ',
          self$`purchase_order_id`
          )
        },
        if (!is.null(self$`start_time`)) {
          sprintf(
          '"start_time":
            %d
                    ',
          self$`start_time`
          )
        },
        if (!is.null(self$`end_time`)) {
          sprintf(
          '"end_time":
            %d
                    ',
          self$`end_time`
          )
        },
        if (!is.null(self$`budget`)) {
          sprintf(
          '"budget":
            %d
                    ',
          self$`budget`
          )
        },
        if (!is.null(self$`paid_budget`)) {
          sprintf(
          '"paid_budget":
            %d
                    ',
          self$`paid_budget`
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`paid_type`)) {
          sprintf(
          '"paid_type":
          %s
          ',
          jsonlite::toJSON(self$`paid_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of OrderLines
    #'
    #' @description
    #' Deserialize JSON string into an instance of OrderLines
    #'
    #' @param input_json the JSON input
    #' @return the instance of OrderLines
    #' @export
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
    #' Validate JSON input with respect to OrderLines
    #'
    #' @description
    #' Validate JSON input with respect to OrderLines and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OrderLines
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
      if (!str_detect(self$`id`, "^\\d+$")) {
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
      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
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
# OrderLines$unlock()
#
## Below is an example to define the print function
# OrderLines$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OrderLines$lock()

