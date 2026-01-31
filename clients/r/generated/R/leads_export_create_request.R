#' Create a new LeadsExportCreateRequest
#'
#' @description
#' LeadsExportCreateRequest Class
#'
#' @docType class
#' @title LeadsExportCreateRequest
#' @description LeadsExportCreateRequest Class
#' @format An \code{R6Class} generator object
#' @field ad_id ID for the ad collecting leads character
#' @field end_date Export leads collected on and before end date (UTC). Format: YYYY-MM-DD character
#' @field start_date Export leads collected on and after start date (UTC). Format: YYYY-MM-DD character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LeadsExportCreateRequest <- R6::R6Class(
  "LeadsExportCreateRequest",
  public = list(
    `ad_id` = NULL,
    `end_date` = NULL,
    `start_date` = NULL,

    #' @description
    #' Initialize a new LeadsExportCreateRequest class.
    #'
    #' @param ad_id ID for the ad collecting leads
    #' @param end_date Export leads collected on and before end date (UTC). Format: YYYY-MM-DD
    #' @param start_date Export leads collected on and after start date (UTC). Format: YYYY-MM-DD
    #' @param ... Other optional arguments.
    initialize = function(`ad_id`, `end_date`, `start_date`, ...) {
      if (!missing(`ad_id`)) {
        if (!(is.character(`ad_id`) && length(`ad_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_id`. Must be a string:", `ad_id`))
        }
        self$`ad_id` <- `ad_id`
      }
      if (!missing(`end_date`)) {
        if (!(is.character(`end_date`) && length(`end_date`) == 1)) {
          stop(paste("Error! Invalid data for `end_date`. Must be a string:", `end_date`))
        }
        self$`end_date` <- `end_date`
      }
      if (!missing(`start_date`)) {
        if (!(is.character(`start_date`) && length(`start_date`) == 1)) {
          stop(paste("Error! Invalid data for `start_date`. Must be a string:", `start_date`))
        }
        self$`start_date` <- `start_date`
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
    #' @return LeadsExportCreateRequest as a base R list.
    #' @examples
    #' # convert array of LeadsExportCreateRequest (x) to a data frame
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
    #' Convert LeadsExportCreateRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LeadsExportCreateRequestObject <- list()
      if (!is.null(self$`ad_id`)) {
        LeadsExportCreateRequestObject[["ad_id"]] <-
          self$`ad_id`
      }
      if (!is.null(self$`end_date`)) {
        LeadsExportCreateRequestObject[["end_date"]] <-
          self$`end_date`
      }
      if (!is.null(self$`start_date`)) {
        LeadsExportCreateRequestObject[["start_date"]] <-
          self$`start_date`
      }
      return(LeadsExportCreateRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadsExportCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadsExportCreateRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_id`)) {
        self$`ad_id` <- this_object$`ad_id`
      }
      if (!is.null(this_object$`end_date`)) {
        self$`end_date` <- this_object$`end_date`
      }
      if (!is.null(this_object$`start_date`)) {
        self$`start_date` <- this_object$`start_date`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LeadsExportCreateRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadsExportCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadsExportCreateRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_id` <- this_object$`ad_id`
      self$`end_date` <- this_object$`end_date`
      self$`start_date` <- this_object$`start_date`
      self
    },

    #' @description
    #' Validate JSON input with respect to LeadsExportCreateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `ad_id`
      if (!is.null(input_json$`ad_id`)) {
        if (!(is.character(input_json$`ad_id`) && length(input_json$`ad_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_id`. Must be a string:", input_json$`ad_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LeadsExportCreateRequest: the required field `ad_id` is missing."))
      }
      # check the required field `end_date`
      if (!is.null(input_json$`end_date`)) {
        if (!(is.character(input_json$`end_date`) && length(input_json$`end_date`) == 1)) {
          stop(paste("Error! Invalid data for `end_date`. Must be a string:", input_json$`end_date`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LeadsExportCreateRequest: the required field `end_date` is missing."))
      }
      # check the required field `start_date`
      if (!is.null(input_json$`start_date`)) {
        if (!(is.character(input_json$`start_date`) && length(input_json$`start_date`) == 1)) {
          stop(paste("Error! Invalid data for `start_date`. Must be a string:", input_json$`start_date`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LeadsExportCreateRequest: the required field `start_date` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LeadsExportCreateRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `ad_id` is null
      if (is.null(self$`ad_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`ad_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `end_date` is null
      if (is.null(self$`end_date`)) {
        return(FALSE)
      }

      if (!str_detect(self$`end_date`, "^(\\d{4})-(\\d{2})-(\\d{2})$")) {
        return(FALSE)
      }

      # check if the required `start_date` is null
      if (is.null(self$`start_date`)) {
        return(FALSE)
      }

      if (!str_detect(self$`start_date`, "^(\\d{4})-(\\d{2})-(\\d{2})$")) {
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
      # check if the required `ad_id` is null
      if (is.null(self$`ad_id`)) {
        invalid_fields["ad_id"] <- "Non-nullable required field `ad_id` cannot be null."
      }

      if (!str_detect(self$`ad_id`, "^\\d+$")) {
        invalid_fields["ad_id"] <- "Invalid value for `ad_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `end_date` is null
      if (is.null(self$`end_date`)) {
        invalid_fields["end_date"] <- "Non-nullable required field `end_date` cannot be null."
      }

      if (!str_detect(self$`end_date`, "^(\\d{4})-(\\d{2})-(\\d{2})$")) {
        invalid_fields["end_date"] <- "Invalid value for `end_date`, must conform to the pattern ^(\\d{4})-(\\d{2})-(\\d{2})$."
      }

      # check if the required `start_date` is null
      if (is.null(self$`start_date`)) {
        invalid_fields["start_date"] <- "Non-nullable required field `start_date` cannot be null."
      }

      if (!str_detect(self$`start_date`, "^(\\d{4})-(\\d{2})-(\\d{2})$")) {
        invalid_fields["start_date"] <- "Invalid value for `start_date`, must conform to the pattern ^(\\d{4})-(\\d{2})-(\\d{2})$."
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
# LeadsExportCreateRequest$unlock()
#
## Below is an example to define the print function
# LeadsExportCreateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LeadsExportCreateRequest$lock()

