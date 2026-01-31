#' Create a new LeadSubscriptionPostParamsCreate
#'
#' @description
#' LeadSubscriptionPostParamsCreate Class
#'
#' @docType class
#' @title LeadSubscriptionPostParamsCreate
#' @description LeadSubscriptionPostParamsCreate Class
#' @format An \code{R6Class} generator object
#' @field lead_form_id Lead form ID. character [optional]
#' @field webhook_url Standard HTTPS webhook URL. character
#' @field partner_access_token Partner access token. Only for clients that requires authentication. We recommend to avoid this param. character [optional]
#' @field partner_metadata  \link{LeadSubscriptionPostParamsCreateAllOfPartnerMetadata} [optional]
#' @field partner_refresh_token Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LeadSubscriptionPostParamsCreate <- R6::R6Class(
  "LeadSubscriptionPostParamsCreate",
  public = list(
    `lead_form_id` = NULL,
    `webhook_url` = NULL,
    `partner_access_token` = NULL,
    `partner_metadata` = NULL,
    `partner_refresh_token` = NULL,

    #' @description
    #' Initialize a new LeadSubscriptionPostParamsCreate class.
    #'
    #' @param webhook_url Standard HTTPS webhook URL.
    #' @param lead_form_id Lead form ID.
    #' @param partner_access_token Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
    #' @param partner_metadata partner_metadata
    #' @param partner_refresh_token Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
    #' @param ... Other optional arguments.
    initialize = function(`webhook_url`, `lead_form_id` = NULL, `partner_access_token` = NULL, `partner_metadata` = NULL, `partner_refresh_token` = NULL, ...) {
      if (!missing(`webhook_url`)) {
        if (!(is.character(`webhook_url`) && length(`webhook_url`) == 1)) {
          stop(paste("Error! Invalid data for `webhook_url`. Must be a string:", `webhook_url`))
        }
        self$`webhook_url` <- `webhook_url`
      }
      if (!is.null(`lead_form_id`)) {
        if (!(is.character(`lead_form_id`) && length(`lead_form_id`) == 1)) {
          stop(paste("Error! Invalid data for `lead_form_id`. Must be a string:", `lead_form_id`))
        }
        self$`lead_form_id` <- `lead_form_id`
      }
      if (!is.null(`partner_access_token`)) {
        if (!(is.character(`partner_access_token`) && length(`partner_access_token`) == 1)) {
          stop(paste("Error! Invalid data for `partner_access_token`. Must be a string:", `partner_access_token`))
        }
        self$`partner_access_token` <- `partner_access_token`
      }
      if (!is.null(`partner_metadata`)) {
        stopifnot(R6::is.R6(`partner_metadata`))
        self$`partner_metadata` <- `partner_metadata`
      }
      if (!is.null(`partner_refresh_token`)) {
        if (!(is.character(`partner_refresh_token`) && length(`partner_refresh_token`) == 1)) {
          stop(paste("Error! Invalid data for `partner_refresh_token`. Must be a string:", `partner_refresh_token`))
        }
        self$`partner_refresh_token` <- `partner_refresh_token`
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
    #' @return LeadSubscriptionPostParamsCreate as a base R list.
    #' @examples
    #' # convert array of LeadSubscriptionPostParamsCreate (x) to a data frame
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
    #' Convert LeadSubscriptionPostParamsCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LeadSubscriptionPostParamsCreateObject <- list()
      if (!is.null(self$`lead_form_id`)) {
        LeadSubscriptionPostParamsCreateObject[["lead_form_id"]] <-
          self$`lead_form_id`
      }
      if (!is.null(self$`webhook_url`)) {
        LeadSubscriptionPostParamsCreateObject[["webhook_url"]] <-
          self$`webhook_url`
      }
      if (!is.null(self$`partner_access_token`)) {
        LeadSubscriptionPostParamsCreateObject[["partner_access_token"]] <-
          self$`partner_access_token`
      }
      if (!is.null(self$`partner_metadata`)) {
        LeadSubscriptionPostParamsCreateObject[["partner_metadata"]] <-
          self$`partner_metadata`$toSimpleType()
      }
      if (!is.null(self$`partner_refresh_token`)) {
        LeadSubscriptionPostParamsCreateObject[["partner_refresh_token"]] <-
          self$`partner_refresh_token`
      }
      return(LeadSubscriptionPostParamsCreateObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadSubscriptionPostParamsCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadSubscriptionPostParamsCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`lead_form_id`)) {
        self$`lead_form_id` <- this_object$`lead_form_id`
      }
      if (!is.null(this_object$`webhook_url`)) {
        self$`webhook_url` <- this_object$`webhook_url`
      }
      if (!is.null(this_object$`partner_access_token`)) {
        self$`partner_access_token` <- this_object$`partner_access_token`
      }
      if (!is.null(this_object$`partner_metadata`)) {
        `partner_metadata_object` <- LeadSubscriptionPostParamsCreateAllOfPartnerMetadata$new()
        `partner_metadata_object`$fromJSON(jsonlite::toJSON(this_object$`partner_metadata`, auto_unbox = TRUE, digits = NA))
        self$`partner_metadata` <- `partner_metadata_object`
      }
      if (!is.null(this_object$`partner_refresh_token`)) {
        self$`partner_refresh_token` <- this_object$`partner_refresh_token`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LeadSubscriptionPostParamsCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadSubscriptionPostParamsCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadSubscriptionPostParamsCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`lead_form_id` <- this_object$`lead_form_id`
      self$`webhook_url` <- this_object$`webhook_url`
      self$`partner_access_token` <- this_object$`partner_access_token`
      self$`partner_metadata` <- LeadSubscriptionPostParamsCreateAllOfPartnerMetadata$new()$fromJSON(jsonlite::toJSON(this_object$`partner_metadata`, auto_unbox = TRUE, digits = NA))
      self$`partner_refresh_token` <- this_object$`partner_refresh_token`
      self
    },

    #' @description
    #' Validate JSON input with respect to LeadSubscriptionPostParamsCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `webhook_url`
      if (!is.null(input_json$`webhook_url`)) {
        if (!(is.character(input_json$`webhook_url`) && length(input_json$`webhook_url`) == 1)) {
          stop(paste("Error! Invalid data for `webhook_url`. Must be a string:", input_json$`webhook_url`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LeadSubscriptionPostParamsCreate: the required field `webhook_url` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LeadSubscriptionPostParamsCreate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`lead_form_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `webhook_url` is null
      if (is.null(self$`webhook_url`)) {
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
      if (!str_detect(self$`lead_form_id`, "^\\d+$")) {
        invalid_fields["lead_form_id"] <- "Invalid value for `lead_form_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `webhook_url` is null
      if (is.null(self$`webhook_url`)) {
        invalid_fields["webhook_url"] <- "Non-nullable required field `webhook_url` cannot be null."
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
# LeadSubscriptionPostParamsCreate$unlock()
#
## Below is an example to define the print function
# LeadSubscriptionPostParamsCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LeadSubscriptionPostParamsCreate$lock()

