#' Create a new CustomerList
#'
#' @description
#' CustomerList Class
#'
#' @docType class
#' @title CustomerList
#' @description CustomerList Class
#' @format An \code{R6Class} generator object
#' @field ad_account_id Associated ad account ID. character [optional]
#' @field created_time Creation time. Unix timestamp in seconds. numeric [optional]
#' @field id Customer list ID. character [optional]
#' @field name Customer list name. character [optional]
#' @field num_batches Total number of list updates.  List creation counts as one batch. Each <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append</a> or <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists. numeric [optional]
#' @field num_removed_user_records Number of removed user records. In a <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call, this counter increases even if the user is not found in the list. numeric [optional]
#' @field num_uploaded_user_records Number of uploaded user records. In an <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append API</a> call, this counter increases even if the uploaded user is already in the list. numeric [optional]
#' @field status Customer list status. TOO_SMALL - the list has less than 100 Pinterest users. character [optional]
#' @field type Always \"customerlist\". character [optional]
#' @field updated_time Last update time. Unix timestamp in seconds. numeric [optional]
#' @field exceptions Customer list errors object [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CustomerList <- R6::R6Class(
  "CustomerList",
  public = list(
    `ad_account_id` = NULL,
    `created_time` = NULL,
    `id` = NULL,
    `name` = NULL,
    `num_batches` = NULL,
    `num_removed_user_records` = NULL,
    `num_uploaded_user_records` = NULL,
    `status` = NULL,
    `type` = NULL,
    `updated_time` = NULL,
    `exceptions` = NULL,
    #' Initialize a new CustomerList class.
    #'
    #' @description
    #' Initialize a new CustomerList class.
    #'
    #' @param ad_account_id Associated ad account ID.
    #' @param created_time Creation time. Unix timestamp in seconds.
    #' @param id Customer list ID.
    #' @param name Customer list name.
    #' @param num_batches Total number of list updates.  List creation counts as one batch. Each <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append</a> or <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists.
    #' @param num_removed_user_records Number of removed user records. In a <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call, this counter increases even if the user is not found in the list.
    #' @param num_uploaded_user_records Number of uploaded user records. In an <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append API</a> call, this counter increases even if the uploaded user is already in the list.
    #' @param status Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.
    #' @param type Always \"customerlist\".
    #' @param updated_time Last update time. Unix timestamp in seconds.
    #' @param exceptions Customer list errors
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`ad_account_id` = NULL, `created_time` = NULL, `id` = NULL, `name` = NULL, `num_batches` = NULL, `num_removed_user_records` = NULL, `num_uploaded_user_records` = NULL, `status` = NULL, `type` = NULL, `updated_time` = NULL, `exceptions` = NULL, ...) {
      if (!is.null(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
      if (!is.null(`created_time`)) {
        self$`created_time` <- `created_time`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`num_batches`)) {
        self$`num_batches` <- `num_batches`
      }
      if (!is.null(`num_removed_user_records`)) {
        self$`num_removed_user_records` <- `num_removed_user_records`
      }
      if (!is.null(`num_uploaded_user_records`)) {
        self$`num_uploaded_user_records` <- `num_uploaded_user_records`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c("PROCESSING", "READY", "TOO_SMALL", "UPLOADING"))) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be \"PROCESSING\", \"READY\", \"TOO_SMALL\", \"UPLOADING\".", sep = ""))
        }
        if (!(is.character(`status`) && length(`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", `status`))
        }
        self$`status` <- `status`
      }
      if (!is.null(`type`)) {
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`updated_time`)) {
        self$`updated_time` <- `updated_time`
      }
      if (!is.null(`exceptions`)) {
        self$`exceptions` <- `exceptions`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CustomerList in JSON format
    #' @export
    toJSON = function() {
      CustomerListObject <- list()
      if (!is.null(self$`ad_account_id`)) {
        CustomerListObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`created_time`)) {
        CustomerListObject[["created_time"]] <-
          self$`created_time`
      }
      if (!is.null(self$`id`)) {
        CustomerListObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        CustomerListObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`num_batches`)) {
        CustomerListObject[["num_batches"]] <-
          self$`num_batches`
      }
      if (!is.null(self$`num_removed_user_records`)) {
        CustomerListObject[["num_removed_user_records"]] <-
          self$`num_removed_user_records`
      }
      if (!is.null(self$`num_uploaded_user_records`)) {
        CustomerListObject[["num_uploaded_user_records"]] <-
          self$`num_uploaded_user_records`
      }
      if (!is.null(self$`status`)) {
        CustomerListObject[["status"]] <-
          self$`status`
      }
      if (!is.null(self$`type`)) {
        CustomerListObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`updated_time`)) {
        CustomerListObject[["updated_time"]] <-
          self$`updated_time`
      }
      if (!is.null(self$`exceptions`)) {
        CustomerListObject[["exceptions"]] <-
          self$`exceptions`
      }
      CustomerListObject
    },
    #' Deserialize JSON string into an instance of CustomerList
    #'
    #' @description
    #' Deserialize JSON string into an instance of CustomerList
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerList
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`created_time`)) {
        self$`created_time` <- this_object$`created_time`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`num_batches`)) {
        self$`num_batches` <- this_object$`num_batches`
      }
      if (!is.null(this_object$`num_removed_user_records`)) {
        self$`num_removed_user_records` <- this_object$`num_removed_user_records`
      }
      if (!is.null(this_object$`num_uploaded_user_records`)) {
        self$`num_uploaded_user_records` <- this_object$`num_uploaded_user_records`
      }
      if (!is.null(this_object$`status`)) {
        if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("PROCESSING", "READY", "TOO_SMALL", "UPLOADING"))) {
          stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"PROCESSING\", \"READY\", \"TOO_SMALL\", \"UPLOADING\".", sep = ""))
        }
        self$`status` <- this_object$`status`
      }
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`updated_time`)) {
        self$`updated_time` <- this_object$`updated_time`
      }
      if (!is.null(this_object$`exceptions`)) {
        self$`exceptions` <- this_object$`exceptions`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CustomerList in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`ad_account_id`)) {
          sprintf(
          '"ad_account_id":
            "%s"
                    ',
          self$`ad_account_id`
          )
        },
        if (!is.null(self$`created_time`)) {
          sprintf(
          '"created_time":
            %d
                    ',
          self$`created_time`
          )
        },
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
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
        if (!is.null(self$`num_batches`)) {
          sprintf(
          '"num_batches":
            %d
                    ',
          self$`num_batches`
          )
        },
        if (!is.null(self$`num_removed_user_records`)) {
          sprintf(
          '"num_removed_user_records":
            %d
                    ',
          self$`num_removed_user_records`
          )
        },
        if (!is.null(self$`num_uploaded_user_records`)) {
          sprintf(
          '"num_uploaded_user_records":
            %d
                    ',
          self$`num_uploaded_user_records`
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
            "%s"
                    ',
          self$`status`
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
        if (!is.null(self$`updated_time`)) {
          sprintf(
          '"updated_time":
            %d
                    ',
          self$`updated_time`
          )
        },
        if (!is.null(self$`exceptions`)) {
          sprintf(
          '"exceptions":
            "%s"
                    ',
          self$`exceptions`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CustomerList
    #'
    #' @description
    #' Deserialize JSON string into an instance of CustomerList
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerList
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`created_time` <- this_object$`created_time`
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`num_batches` <- this_object$`num_batches`
      self$`num_removed_user_records` <- this_object$`num_removed_user_records`
      self$`num_uploaded_user_records` <- this_object$`num_uploaded_user_records`
      if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("PROCESSING", "READY", "TOO_SMALL", "UPLOADING"))) {
        stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"PROCESSING\", \"READY\", \"TOO_SMALL\", \"UPLOADING\".", sep = ""))
      }
      self$`status` <- this_object$`status`
      self$`type` <- this_object$`type`
      self$`updated_time` <- this_object$`updated_time`
      self$`exceptions` <- this_object$`exceptions`
      self
    },
    #' Validate JSON input with respect to CustomerList
    #'
    #' @description
    #' Validate JSON input with respect to CustomerList and throw an exception if invalid
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
    #' @return String representation of CustomerList
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
# CustomerList$unlock()
#
## Below is an example to define the print function
# CustomerList$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CustomerList$lock()

