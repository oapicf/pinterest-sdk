#' Create a new GenderDemographics
#'
#' @description
#' Gender demographic distribution
#'
#' @docType class
#' @title GenderDemographics
#' @description GenderDemographics Class
#' @format An \code{R6Class} generator object
#' @field female Percentage of female users numeric
#' @field male Percentage of male users numeric
#' @field unspecified Percentage of users with unspecified gender numeric
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GenderDemographics <- R6::R6Class(
  "GenderDemographics",
  public = list(
    `female` = NULL,
    `male` = NULL,
    `unspecified` = NULL,

    #' @description
    #' Initialize a new GenderDemographics class.
    #'
    #' @param female Percentage of female users
    #' @param male Percentage of male users
    #' @param unspecified Percentage of users with unspecified gender
    #' @param ... Other optional arguments.
    initialize = function(`female`, `male`, `unspecified`, ...) {
      if (!missing(`female`)) {
        self$`female` <- `female`
      }
      if (!missing(`male`)) {
        self$`male` <- `male`
      }
      if (!missing(`unspecified`)) {
        self$`unspecified` <- `unspecified`
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
    #' @return GenderDemographics as a base R list.
    #' @examples
    #' # convert array of GenderDemographics (x) to a data frame
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
    #' Convert GenderDemographics to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      GenderDemographicsObject <- list()
      if (!is.null(self$`female`)) {
        GenderDemographicsObject[["female"]] <-
          self$`female`
      }
      if (!is.null(self$`male`)) {
        GenderDemographicsObject[["male"]] <-
          self$`male`
      }
      if (!is.null(self$`unspecified`)) {
        GenderDemographicsObject[["unspecified"]] <-
          self$`unspecified`
      }
      return(GenderDemographicsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of GenderDemographics
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenderDemographics
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`female`)) {
        self$`female` <- this_object$`female`
      }
      if (!is.null(this_object$`male`)) {
        self$`male` <- this_object$`male`
      }
      if (!is.null(this_object$`unspecified`)) {
        self$`unspecified` <- this_object$`unspecified`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return GenderDemographics in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of GenderDemographics
    #'
    #' @param input_json the JSON input
    #' @return the instance of GenderDemographics
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`female` <- this_object$`female`
      self$`male` <- this_object$`male`
      self$`unspecified` <- this_object$`unspecified`
      self
    },

    #' @description
    #' Validate JSON input with respect to GenderDemographics and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `female`
      if (!is.null(input_json$`female`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenderDemographics: the required field `female` is missing."))
      }
      # check the required field `male`
      if (!is.null(input_json$`male`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenderDemographics: the required field `male` is missing."))
      }
      # check the required field `unspecified`
      if (!is.null(input_json$`unspecified`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GenderDemographics: the required field `unspecified` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GenderDemographics
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `female` is null
      if (is.null(self$`female`)) {
        return(FALSE)
      }

      # check if the required `male` is null
      if (is.null(self$`male`)) {
        return(FALSE)
      }

      # check if the required `unspecified` is null
      if (is.null(self$`unspecified`)) {
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
      # check if the required `female` is null
      if (is.null(self$`female`)) {
        invalid_fields["female"] <- "Non-nullable required field `female` cannot be null."
      }

      # check if the required `male` is null
      if (is.null(self$`male`)) {
        invalid_fields["male"] <- "Non-nullable required field `male` cannot be null."
      }

      # check if the required `unspecified` is null
      if (is.null(self$`unspecified`)) {
        invalid_fields["unspecified"] <- "Non-nullable required field `unspecified` cannot be null."
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
# GenderDemographics$unlock()
#
## Below is an example to define the print function
# GenderDemographics$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GenderDemographics$lock()

