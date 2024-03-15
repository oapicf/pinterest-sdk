#' Create a new AdAccountCreateRequest
#'
#' @description
#' AdAccountCreateRequest Class
#'
#' @docType class
#' @title AdAccountCreateRequest
#' @description AdAccountCreateRequest Class
#' @format An \code{R6Class} generator object
#' @field country  \link{Country} [optional]
#' @field name Ad Account name. character [optional]
#' @field owner_user_id Advertiser's owning user ID. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdAccountCreateRequest <- R6::R6Class(
  "AdAccountCreateRequest",
  public = list(
    `country` = NULL,
    `name` = NULL,
    `owner_user_id` = NULL,
    #' Initialize a new AdAccountCreateRequest class.
    #'
    #' @description
    #' Initialize a new AdAccountCreateRequest class.
    #'
    #' @param country country
    #' @param name Ad Account name.
    #' @param owner_user_id Advertiser's owning user ID.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`country` = NULL, `name` = NULL, `owner_user_id` = NULL, ...) {
      if (!is.null(`country`)) {
        if (!(`country` %in% c())) {
          stop(paste("Error! \"", `country`, "\" cannot be assigned to `country`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`country`))
        self$`country` <- `country`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`owner_user_id`)) {
        if (!(is.character(`owner_user_id`) && length(`owner_user_id`) == 1)) {
          stop(paste("Error! Invalid data for `owner_user_id`. Must be a string:", `owner_user_id`))
        }
        self$`owner_user_id` <- `owner_user_id`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdAccountCreateRequest in JSON format
    #' @export
    toJSON = function() {
      AdAccountCreateRequestObject <- list()
      if (!is.null(self$`country`)) {
        AdAccountCreateRequestObject[["country"]] <-
          self$`country`$toJSON()
      }
      if (!is.null(self$`name`)) {
        AdAccountCreateRequestObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`owner_user_id`)) {
        AdAccountCreateRequestObject[["owner_user_id"]] <-
          self$`owner_user_id`
      }
      AdAccountCreateRequestObject
    },
    #' Deserialize JSON string into an instance of AdAccountCreateRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdAccountCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdAccountCreateRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`country`)) {
        `country_object` <- Country$new()
        `country_object`$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
        self$`country` <- `country_object`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`owner_user_id`)) {
        self$`owner_user_id` <- this_object$`owner_user_id`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdAccountCreateRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`country`)) {
          sprintf(
          '"country":
          %s
          ',
          jsonlite::toJSON(self$`country`$toJSON(), auto_unbox = TRUE, digits = NA)
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
        if (!is.null(self$`owner_user_id`)) {
          sprintf(
          '"owner_user_id":
            "%s"
                    ',
          self$`owner_user_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AdAccountCreateRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdAccountCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdAccountCreateRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`country` <- Country$new()$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
      self$`name` <- this_object$`name`
      self$`owner_user_id` <- this_object$`owner_user_id`
      self
    },
    #' Validate JSON input with respect to AdAccountCreateRequest
    #'
    #' @description
    #' Validate JSON input with respect to AdAccountCreateRequest and throw an exception if invalid
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
    #' @return String representation of AdAccountCreateRequest
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
      if (nchar(self$`name`) > 256) {
        return(FALSE)
      }

      if (!str_detect(self$`owner_user_id`, "^\\d+$")) {
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
      if (nchar(self$`name`) > 256) {
        invalid_fields["name"] <- "Invalid length for `name`, must be smaller than or equal to 256."
      }

      if (!str_detect(self$`owner_user_id`, "^\\d+$")) {
        invalid_fields["owner_user_id"] <- "Invalid value for `owner_user_id`, must conform to the pattern ^\\d+$."
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
# AdAccountCreateRequest$unlock()
#
## Below is an example to define the print function
# AdAccountCreateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdAccountCreateRequest$lock()

