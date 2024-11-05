#' Create a new AudienceCreateCustomRequest
#'
#' @description
#' AudienceCreateCustomRequest Class
#'
#' @docType class
#' @title AudienceCreateCustomRequest
#' @description AudienceCreateCustomRequest Class
#' @format An \code{R6Class} generator object
#' @field ad_account_id Ad account ID. character [optional]
#' @field name Audience name. character
#' @field rule  \link{AudienceRule}
#' @field sharing_type  \link{AudienceSharingType}
#' @field data_party  \link{AudienceDataParty}
#' @field category  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AudienceCreateCustomRequest <- R6::R6Class(
  "AudienceCreateCustomRequest",
  public = list(
    `ad_account_id` = NULL,
    `name` = NULL,
    `rule` = NULL,
    `sharing_type` = NULL,
    `data_party` = NULL,
    `category` = NULL,

    #' @description
    #' Initialize a new AudienceCreateCustomRequest class.
    #'
    #' @param name Audience name.
    #' @param rule rule
    #' @param sharing_type sharing_type
    #' @param data_party data_party
    #' @param ad_account_id Ad account ID.
    #' @param category category
    #' @param ... Other optional arguments.
    initialize = function(`name`, `rule`, `sharing_type`, `data_party`, `ad_account_id` = NULL, `category` = NULL, ...) {
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`rule`)) {
        stopifnot(R6::is.R6(`rule`))
        self$`rule` <- `rule`
      }
      if (!missing(`sharing_type`)) {
        if (!(`sharing_type` %in% c())) {
          stop(paste("Error! \"", `sharing_type`, "\" cannot be assigned to `sharing_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`sharing_type`))
        self$`sharing_type` <- `sharing_type`
      }
      if (!missing(`data_party`)) {
        if (!(`data_party` %in% c())) {
          stop(paste("Error! \"", `data_party`, "\" cannot be assigned to `data_party`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`data_party`))
        self$`data_party` <- `data_party`
      }
      if (!is.null(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
      if (!is.null(`category`)) {
        if (!(is.character(`category`) && length(`category`) == 1)) {
          stop(paste("Error! Invalid data for `category`. Must be a string:", `category`))
        }
        self$`category` <- `category`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return AudienceCreateCustomRequest in JSON format
    toJSON = function() {
      AudienceCreateCustomRequestObject <- list()
      if (!is.null(self$`ad_account_id`)) {
        AudienceCreateCustomRequestObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`name`)) {
        AudienceCreateCustomRequestObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`rule`)) {
        AudienceCreateCustomRequestObject[["rule"]] <-
          self$`rule`$toJSON()
      }
      if (!is.null(self$`sharing_type`)) {
        AudienceCreateCustomRequestObject[["sharing_type"]] <-
          self$`sharing_type`$toJSON()
      }
      if (!is.null(self$`data_party`)) {
        AudienceCreateCustomRequestObject[["data_party"]] <-
          self$`data_party`$toJSON()
      }
      if (!is.null(self$`category`)) {
        AudienceCreateCustomRequestObject[["category"]] <-
          self$`category`
      }
      AudienceCreateCustomRequestObject
    },

    #' @description
    #' Deserialize JSON string into an instance of AudienceCreateCustomRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceCreateCustomRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`rule`)) {
        `rule_object` <- AudienceRule$new()
        `rule_object`$fromJSON(jsonlite::toJSON(this_object$`rule`, auto_unbox = TRUE, digits = NA))
        self$`rule` <- `rule_object`
      }
      if (!is.null(this_object$`sharing_type`)) {
        `sharing_type_object` <- AudienceSharingType$new()
        `sharing_type_object`$fromJSON(jsonlite::toJSON(this_object$`sharing_type`, auto_unbox = TRUE, digits = NA))
        self$`sharing_type` <- `sharing_type_object`
      }
      if (!is.null(this_object$`data_party`)) {
        `data_party_object` <- AudienceDataParty$new()
        `data_party_object`$fromJSON(jsonlite::toJSON(this_object$`data_party`, auto_unbox = TRUE, digits = NA))
        self$`data_party` <- `data_party_object`
      }
      if (!is.null(this_object$`category`)) {
        self$`category` <- this_object$`category`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return AudienceCreateCustomRequest in JSON format
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
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`rule`)) {
          sprintf(
          '"rule":
          %s
          ',
          jsonlite::toJSON(self$`rule`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`sharing_type`)) {
          sprintf(
          '"sharing_type":
          %s
          ',
          jsonlite::toJSON(self$`sharing_type`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`data_party`)) {
          sprintf(
          '"data_party":
          %s
          ',
          jsonlite::toJSON(self$`data_party`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`category`)) {
          sprintf(
          '"category":
            "%s"
                    ',
          self$`category`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of AudienceCreateCustomRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of AudienceCreateCustomRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`name` <- this_object$`name`
      self$`rule` <- AudienceRule$new()$fromJSON(jsonlite::toJSON(this_object$`rule`, auto_unbox = TRUE, digits = NA))
      self$`sharing_type` <- AudienceSharingType$new()$fromJSON(jsonlite::toJSON(this_object$`sharing_type`, auto_unbox = TRUE, digits = NA))
      self$`data_party` <- AudienceDataParty$new()$fromJSON(jsonlite::toJSON(this_object$`data_party`, auto_unbox = TRUE, digits = NA))
      self$`category` <- this_object$`category`
      self
    },

    #' @description
    #' Validate JSON input with respect to AudienceCreateCustomRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AudienceCreateCustomRequest: the required field `name` is missing."))
      }
      # check the required field `rule`
      if (!is.null(input_json$`rule`)) {
        stopifnot(R6::is.R6(input_json$`rule`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AudienceCreateCustomRequest: the required field `rule` is missing."))
      }
      # check the required field `sharing_type`
      if (!is.null(input_json$`sharing_type`)) {
        stopifnot(R6::is.R6(input_json$`sharing_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AudienceCreateCustomRequest: the required field `sharing_type` is missing."))
      }
      # check the required field `data_party`
      if (!is.null(input_json$`data_party`)) {
        stopifnot(R6::is.R6(input_json$`data_party`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AudienceCreateCustomRequest: the required field `data_party` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AudienceCreateCustomRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      # check if the required `rule` is null
      if (is.null(self$`rule`)) {
        return(FALSE)
      }

      # check if the required `sharing_type` is null
      if (is.null(self$`sharing_type`)) {
        return(FALSE)
      }

      # check if the required `data_party` is null
      if (is.null(self$`data_party`)) {
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
      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        invalid_fields["ad_account_id"] <- "Invalid value for `ad_account_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      # check if the required `rule` is null
      if (is.null(self$`rule`)) {
        invalid_fields["rule"] <- "Non-nullable required field `rule` cannot be null."
      }

      # check if the required `sharing_type` is null
      if (is.null(self$`sharing_type`)) {
        invalid_fields["sharing_type"] <- "Non-nullable required field `sharing_type` cannot be null."
      }

      # check if the required `data_party` is null
      if (is.null(self$`data_party`)) {
        invalid_fields["data_party"] <- "Non-nullable required field `data_party` cannot be null."
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
# AudienceCreateCustomRequest$unlock()
#
## Below is an example to define the print function
# AudienceCreateCustomRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AudienceCreateCustomRequest$lock()

