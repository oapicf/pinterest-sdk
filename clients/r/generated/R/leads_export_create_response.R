#' Create a new LeadsExportCreateResponse
#'
#' @description
#' LeadsExportCreateResponse Class
#'
#' @docType class
#' @title LeadsExportCreateResponse
#' @description LeadsExportCreateResponse Class
#' @format An \code{R6Class} generator object
#' @field leads_export_id ID for the leads export job character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LeadsExportCreateResponse <- R6::R6Class(
  "LeadsExportCreateResponse",
  public = list(
    `leads_export_id` = NULL,

    #' @description
    #' Initialize a new LeadsExportCreateResponse class.
    #'
    #' @param leads_export_id ID for the leads export job
    #' @param ... Other optional arguments.
    initialize = function(`leads_export_id` = NULL, ...) {
      if (!is.null(`leads_export_id`)) {
        if (!(is.character(`leads_export_id`) && length(`leads_export_id`) == 1)) {
          stop(paste("Error! Invalid data for `leads_export_id`. Must be a string:", `leads_export_id`))
        }
        self$`leads_export_id` <- `leads_export_id`
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
    #' @return LeadsExportCreateResponse as a base R list.
    #' @examples
    #' # convert array of LeadsExportCreateResponse (x) to a data frame
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
    #' Convert LeadsExportCreateResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LeadsExportCreateResponseObject <- list()
      if (!is.null(self$`leads_export_id`)) {
        LeadsExportCreateResponseObject[["leads_export_id"]] <-
          self$`leads_export_id`
      }
      return(LeadsExportCreateResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadsExportCreateResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadsExportCreateResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`leads_export_id`)) {
        self$`leads_export_id` <- this_object$`leads_export_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LeadsExportCreateResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LeadsExportCreateResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of LeadsExportCreateResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`leads_export_id` <- this_object$`leads_export_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to LeadsExportCreateResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LeadsExportCreateResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`leads_export_id`, "^\\d+$")) {
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
      if (!str_detect(self$`leads_export_id`, "^\\d+$")) {
        invalid_fields["leads_export_id"] <- "Invalid value for `leads_export_id`, must conform to the pattern ^\\d+$."
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
# LeadsExportCreateResponse$unlock()
#
## Below is an example to define the print function
# LeadsExportCreateResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LeadsExportCreateResponse$lock()

