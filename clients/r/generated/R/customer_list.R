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
#' @field exceptions Customer list errors. object [optional]
#' @field id Customer list ID. character
#' @field is_nca Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. character [optional]
#' @field name Customer list name. character
#' @field num_batches Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists. numeric [optional]
#' @field num_removed_user_records Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list. numeric [optional]
#' @field num_uploaded_user_records Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list. numeric [optional]
#' @field status Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users. \link{CustomerListStatus} [optional]
#' @field type Always `customerlist`. character [optional]
#' @field updated_time Last update time. Unix timestamp in seconds. numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CustomerList <- R6::R6Class(
  "CustomerList",
  public = list(
    `ad_account_id` = NULL,
    `created_time` = NULL,
    `exceptions` = NULL,
    `id` = NULL,
    `is_nca` = NULL,
    `name` = NULL,
    `num_batches` = NULL,
    `num_removed_user_records` = NULL,
    `num_uploaded_user_records` = NULL,
    `status` = NULL,
    `type` = NULL,
    `updated_time` = NULL,

    #' @description
    #' Initialize a new CustomerList class.
    #'
    #' @param id Customer list ID.
    #' @param name Customer list name.
    #' @param ad_account_id Associated ad account ID.
    #' @param created_time Creation time. Unix timestamp in seconds.
    #' @param exceptions Customer list errors.
    #' @param is_nca Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
    #' @param num_batches Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.
    #' @param num_removed_user_records Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.
    #' @param num_uploaded_user_records Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.
    #' @param status Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
    #' @param type Always `customerlist`.
    #' @param updated_time Last update time. Unix timestamp in seconds.
    #' @param ... Other optional arguments.
    initialize = function(`id`, `name`, `ad_account_id` = NULL, `created_time` = NULL, `exceptions` = NULL, `is_nca` = NULL, `num_batches` = NULL, `num_removed_user_records` = NULL, `num_uploaded_user_records` = NULL, `status` = NULL, `type` = NULL, `updated_time` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
      if (!is.null(`created_time`)) {
        self$`created_time` <- `created_time`
      }
      if (!is.null(`exceptions`)) {
        self$`exceptions` <- `exceptions`
      }
      if (!is.null(`is_nca`)) {
        if (!(is.logical(`is_nca`) && length(`is_nca`) == 1)) {
          stop(paste("Error! Invalid data for `is_nca`. Must be a boolean:", `is_nca`))
        }
        self$`is_nca` <- `is_nca`
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
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
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
    #' @return CustomerList as a base R list.
    #' @examples
    #' # convert array of CustomerList (x) to a data frame
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
    #' Convert CustomerList to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CustomerListObject <- list()
      if (!is.null(self$`ad_account_id`)) {
        CustomerListObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`created_time`)) {
        CustomerListObject[["created_time"]] <-
          self$`created_time`
      }
      if (!is.null(self$`exceptions`)) {
        CustomerListObject[["exceptions"]] <-
          self$`exceptions`
      }
      if (!is.null(self$`id`)) {
        CustomerListObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`is_nca`)) {
        CustomerListObject[["is_nca"]] <-
          self$`is_nca`
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
          self$extractSimpleType(self$`status`)
      }
      if (!is.null(self$`type`)) {
        CustomerListObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`updated_time`)) {
        CustomerListObject[["updated_time"]] <-
          self$`updated_time`
      }
      return(CustomerListObject)
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
    #' Deserialize JSON string into an instance of CustomerList
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerList
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`created_time`)) {
        self$`created_time` <- this_object$`created_time`
      }
      if (!is.null(this_object$`exceptions`)) {
        self$`exceptions` <- this_object$`exceptions`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`is_nca`)) {
        self$`is_nca` <- this_object$`is_nca`
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
        `status_object` <- CustomerListStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`updated_time`)) {
        self$`updated_time` <- this_object$`updated_time`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CustomerList in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CustomerList
    #'
    #' @param input_json the JSON input
    #' @return the instance of CustomerList
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`created_time` <- this_object$`created_time`
      self$`exceptions` <- this_object$`exceptions`
      self$`id` <- this_object$`id`
      self$`is_nca` <- this_object$`is_nca`
      self$`name` <- this_object$`name`
      self$`num_batches` <- this_object$`num_batches`
      self$`num_removed_user_records` <- this_object$`num_removed_user_records`
      self$`num_uploaded_user_records` <- this_object$`num_uploaded_user_records`
      self$`status` <- CustomerListStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`type` <- this_object$`type`
      self$`updated_time` <- this_object$`updated_time`
      self
    },

    #' @description
    #' Validate JSON input with respect to CustomerList and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerList: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CustomerList: the required field `name` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CustomerList
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (nchar(self$`id`) > 18) {
        return(FALSE)
      }
      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (nchar(self$`id`) > 18) {
        invalid_fields["id"] <- "Invalid length for `id`, must be smaller than or equal to 18."
      }
      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
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
# CustomerList$unlock()
#
## Below is an example to define the print function
# CustomerList$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CustomerList$lock()

