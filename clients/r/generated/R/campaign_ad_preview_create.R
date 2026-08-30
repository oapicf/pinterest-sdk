#' Create a new CampaignAdPreviewCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title CampaignAdPreviewCreate
#' @description CampaignAdPreviewCreate Class
#' @format An \code{R6Class} generator object
#' @field ad_group_id Ad group ID to create a preview record for. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CampaignAdPreviewCreate <- R6::R6Class(
  "CampaignAdPreviewCreate",
  public = list(
    `ad_group_id` = NULL,

    #' @description
    #' Initialize a new CampaignAdPreviewCreate class.
    #'
    #' @param ad_group_id Ad group ID to create a preview record for.
    #' @param ... Other optional arguments.
    initialize = function(`ad_group_id`, ...) {
      if (!missing(`ad_group_id`)) {
        if (!(is.character(`ad_group_id`) && length(`ad_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_group_id`. Must be a string:", `ad_group_id`))
        }
        self$`ad_group_id` <- `ad_group_id`
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
    #' @return CampaignAdPreviewCreate as a base R list.
    #' @examples
    #' # convert array of CampaignAdPreviewCreate (x) to a data frame
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
    #' Convert CampaignAdPreviewCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CampaignAdPreviewCreateObject <- list()
      if (!is.null(self$`ad_group_id`)) {
        CampaignAdPreviewCreateObject[["ad_group_id"]] <-
          self$`ad_group_id`
      }
      return(CampaignAdPreviewCreateObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignAdPreviewCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignAdPreviewCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_group_id`)) {
        self$`ad_group_id` <- this_object$`ad_group_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CampaignAdPreviewCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CampaignAdPreviewCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of CampaignAdPreviewCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_group_id` <- this_object$`ad_group_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to CampaignAdPreviewCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `ad_group_id`
      if (!is.null(input_json$`ad_group_id`)) {
        if (!(is.character(input_json$`ad_group_id`) && length(input_json$`ad_group_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_group_id`. Must be a string:", input_json$`ad_group_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CampaignAdPreviewCreate: the required field `ad_group_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CampaignAdPreviewCreate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `ad_group_id` is null
      if (is.null(self$`ad_group_id`)) {
        return(FALSE)
      }

      if (nchar(self$`ad_group_id`) > 18) {
        return(FALSE)
      }
      if (!str_detect(self$`ad_group_id`, "^\\d+$")) {
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
      # check if the required `ad_group_id` is null
      if (is.null(self$`ad_group_id`)) {
        invalid_fields["ad_group_id"] <- "Non-nullable required field `ad_group_id` cannot be null."
      }

      if (nchar(self$`ad_group_id`) > 18) {
        invalid_fields["ad_group_id"] <- "Invalid length for `ad_group_id`, must be smaller than or equal to 18."
      }
      if (!str_detect(self$`ad_group_id`, "^\\d+$")) {
        invalid_fields["ad_group_id"] <- "Invalid value for `ad_group_id`, must conform to the pattern ^\\d+$."
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
# CampaignAdPreviewCreate$unlock()
#
## Below is an example to define the print function
# CampaignAdPreviewCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CampaignAdPreviewCreate$lock()

