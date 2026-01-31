#' Create a new TargetingSpec
#'
#' @description
#' Ad group targeting specification defining the ad group target audience. For example, `{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"MINIMUM_AGE\":\"18\", \"MAXIMUM_AGE\":\"65+\"}`
#'
#' @docType class
#' @title TargetingSpec
#' @description TargetingSpec Class
#' @format An \code{R6Class} generator object
#' @field AGE_BUCKET **Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted. list(\link{TargetingSpecAgeBucket}) [optional]
#' @field APPTYPE Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted. list(\link{TargetingSpecAppType}) [optional]
#' @field AUDIENCE_EXCLUDE Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**. list(character) [optional]
#' @field AUDIENCE_INCLUDE Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**. list(character) [optional]
#' @field GENDER Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**. list(\link{TargetingSpecGender}) [optional]
#' @field GEO Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. At least one of LOCATION or GEO must be specified. If the GEO field is missing, then only LOCATION values will be targeted (see LOCATION field below). list(character) [optional]
#' @field INTEREST Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**. list(character) [optional]
#' @field LOCALE 24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted. list(character) [optional]
#' @field LOCATION 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a>. Location-Country and Location-Metro codes apply. At least one of LOCATION or GEO must be specified. If the LOCATION field is missing, then only GEO values will be targeted (see GEO field above). list(character) [optional]
#' @field MAXIMUM_AGE Maximum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\", \"65+\". Must be used together with `MINIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted. character [optional]
#' @field MINIMUM_AGE Minimum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\". Note: 65+ is not allowed for minimum age. Must be used together with `MAXIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted. character [optional]
#' @field SHOPPING_RETARGETING Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting list(\link{TargetingSpecShoppingRetargeting}) [optional]
#' @field TARGETING_STRATEGY  list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TargetingSpec <- R6::R6Class(
  "TargetingSpec",
  public = list(
    `AGE_BUCKET` = NULL,
    `APPTYPE` = NULL,
    `AUDIENCE_EXCLUDE` = NULL,
    `AUDIENCE_INCLUDE` = NULL,
    `GENDER` = NULL,
    `GEO` = NULL,
    `INTEREST` = NULL,
    `LOCALE` = NULL,
    `LOCATION` = NULL,
    `MAXIMUM_AGE` = NULL,
    `MINIMUM_AGE` = NULL,
    `SHOPPING_RETARGETING` = NULL,
    `TARGETING_STRATEGY` = NULL,

    #' @description
    #' Initialize a new TargetingSpec class.
    #'
    #' @param AGE_BUCKET **Legacy field.** Predefined age ranges. We recommend using MINIMUM_AGE and MAXIMUM_AGE instead for more flexible targeting. Cannot be combined with MINIMUM_AGE/MAXIMUM_AGE. If neither AGE_BUCKET nor MINIMUM_AGE/MAXIMUM_AGE are specified, all ages will be targeted.
    #' @param APPTYPE Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
    #' @param AUDIENCE_EXCLUDE Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
    #' @param AUDIENCE_INCLUDE Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
    #' @param GENDER Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
    #' @param GEO Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. At least one of LOCATION or GEO must be specified. If the GEO field is missing, then only LOCATION values will be targeted (see LOCATION field below).
    #' @param INTEREST Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
    #' @param LOCALE 24 ISO 639-1 two-letter language codes. If the LOCALE field is not included in the request, all languages are targeted.
    #' @param LOCATION 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a>. Location-Country and Location-Metro codes apply. At least one of LOCATION or GEO must be specified. If the LOCATION field is missing, then only GEO values will be targeted (see GEO field above).
    #' @param MAXIMUM_AGE Maximum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\", \"65+\". Must be used together with `MINIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
    #' @param MINIMUM_AGE Minimum age to target (inclusive). Values: \"18\", \"19\", ..., \"65\". Note: 65+ is not allowed for minimum age. Must be used together with `MAXIMUM_AGE`. Cannot be combined with `AGE_BUCKET`. If neither `MINIMUM_AGE`/`MAXIMUM_AGE` nor `AGE_BUCKET` are specified, all ages will be targeted.
    #' @param SHOPPING_RETARGETING Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
    #' @param TARGETING_STRATEGY 
    #' @param ... Other optional arguments.
    initialize = function(`AGE_BUCKET` = NULL, `APPTYPE` = NULL, `AUDIENCE_EXCLUDE` = NULL, `AUDIENCE_INCLUDE` = NULL, `GENDER` = NULL, `GEO` = NULL, `INTEREST` = NULL, `LOCALE` = NULL, `LOCATION` = NULL, `MAXIMUM_AGE` = NULL, `MINIMUM_AGE` = NULL, `SHOPPING_RETARGETING` = NULL, `TARGETING_STRATEGY` = NULL, ...) {
      if (!is.null(`AGE_BUCKET`)) {
        stopifnot(is.vector(`AGE_BUCKET`), length(`AGE_BUCKET`) != 0)
        sapply(`AGE_BUCKET`, function(x) stopifnot(R6::is.R6(x)))
        self$`AGE_BUCKET` <- `AGE_BUCKET`
      }
      if (!is.null(`APPTYPE`)) {
        stopifnot(is.vector(`APPTYPE`), length(`APPTYPE`) != 0)
        sapply(`APPTYPE`, function(x) stopifnot(R6::is.R6(x)))
        self$`APPTYPE` <- `APPTYPE`
      }
      if (!is.null(`AUDIENCE_EXCLUDE`)) {
        stopifnot(is.vector(`AUDIENCE_EXCLUDE`), length(`AUDIENCE_EXCLUDE`) != 0)
        sapply(`AUDIENCE_EXCLUDE`, function(x) stopifnot(is.character(x)))
        self$`AUDIENCE_EXCLUDE` <- `AUDIENCE_EXCLUDE`
      }
      if (!is.null(`AUDIENCE_INCLUDE`)) {
        stopifnot(is.vector(`AUDIENCE_INCLUDE`), length(`AUDIENCE_INCLUDE`) != 0)
        sapply(`AUDIENCE_INCLUDE`, function(x) stopifnot(is.character(x)))
        self$`AUDIENCE_INCLUDE` <- `AUDIENCE_INCLUDE`
      }
      if (!is.null(`GENDER`)) {
        stopifnot(is.vector(`GENDER`), length(`GENDER`) != 0)
        sapply(`GENDER`, function(x) stopifnot(R6::is.R6(x)))
        self$`GENDER` <- `GENDER`
      }
      if (!is.null(`GEO`)) {
        stopifnot(is.vector(`GEO`), length(`GEO`) != 0)
        sapply(`GEO`, function(x) stopifnot(is.character(x)))
        self$`GEO` <- `GEO`
      }
      if (!is.null(`INTEREST`)) {
        stopifnot(is.vector(`INTEREST`), length(`INTEREST`) != 0)
        sapply(`INTEREST`, function(x) stopifnot(is.character(x)))
        self$`INTEREST` <- `INTEREST`
      }
      if (!is.null(`LOCALE`)) {
        stopifnot(is.vector(`LOCALE`), length(`LOCALE`) != 0)
        sapply(`LOCALE`, function(x) stopifnot(is.character(x)))
        self$`LOCALE` <- `LOCALE`
      }
      if (!is.null(`LOCATION`)) {
        stopifnot(is.vector(`LOCATION`), length(`LOCATION`) != 0)
        sapply(`LOCATION`, function(x) stopifnot(is.character(x)))
        self$`LOCATION` <- `LOCATION`
      }
      if (!is.null(`MAXIMUM_AGE`)) {
        if (!(is.character(`MAXIMUM_AGE`) && length(`MAXIMUM_AGE`) == 1)) {
          stop(paste("Error! Invalid data for `MAXIMUM_AGE`. Must be a string:", `MAXIMUM_AGE`))
        }
        self$`MAXIMUM_AGE` <- `MAXIMUM_AGE`
      }
      if (!is.null(`MINIMUM_AGE`)) {
        if (!(is.character(`MINIMUM_AGE`) && length(`MINIMUM_AGE`) == 1)) {
          stop(paste("Error! Invalid data for `MINIMUM_AGE`. Must be a string:", `MINIMUM_AGE`))
        }
        self$`MINIMUM_AGE` <- `MINIMUM_AGE`
      }
      if (!is.null(`SHOPPING_RETARGETING`)) {
        stopifnot(is.vector(`SHOPPING_RETARGETING`), length(`SHOPPING_RETARGETING`) != 0)
        sapply(`SHOPPING_RETARGETING`, function(x) stopifnot(R6::is.R6(x)))
        self$`SHOPPING_RETARGETING` <- `SHOPPING_RETARGETING`
      }
      if (!is.null(`TARGETING_STRATEGY`)) {
        stopifnot(is.vector(`TARGETING_STRATEGY`), length(`TARGETING_STRATEGY`) != 0)
        sapply(`TARGETING_STRATEGY`, function(x) stopifnot(is.character(x)))
        self$`TARGETING_STRATEGY` <- `TARGETING_STRATEGY`
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
    #' @return TargetingSpec as a base R list.
    #' @examples
    #' # convert array of TargetingSpec (x) to a data frame
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
    #' Convert TargetingSpec to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TargetingSpecObject <- list()
      if (!is.null(self$`AGE_BUCKET`)) {
        TargetingSpecObject[["AGE_BUCKET"]] <-
          lapply(self$`AGE_BUCKET`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`APPTYPE`)) {
        TargetingSpecObject[["APPTYPE"]] <-
          lapply(self$`APPTYPE`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`AUDIENCE_EXCLUDE`)) {
        TargetingSpecObject[["AUDIENCE_EXCLUDE"]] <-
          self$`AUDIENCE_EXCLUDE`
      }
      if (!is.null(self$`AUDIENCE_INCLUDE`)) {
        TargetingSpecObject[["AUDIENCE_INCLUDE"]] <-
          self$`AUDIENCE_INCLUDE`
      }
      if (!is.null(self$`GENDER`)) {
        TargetingSpecObject[["GENDER"]] <-
          lapply(self$`GENDER`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`GEO`)) {
        TargetingSpecObject[["GEO"]] <-
          self$`GEO`
      }
      if (!is.null(self$`INTEREST`)) {
        TargetingSpecObject[["INTEREST"]] <-
          self$`INTEREST`
      }
      if (!is.null(self$`LOCALE`)) {
        TargetingSpecObject[["LOCALE"]] <-
          self$`LOCALE`
      }
      if (!is.null(self$`LOCATION`)) {
        TargetingSpecObject[["LOCATION"]] <-
          self$`LOCATION`
      }
      if (!is.null(self$`MAXIMUM_AGE`)) {
        TargetingSpecObject[["MAXIMUM_AGE"]] <-
          self$`MAXIMUM_AGE`
      }
      if (!is.null(self$`MINIMUM_AGE`)) {
        TargetingSpecObject[["MINIMUM_AGE"]] <-
          self$`MINIMUM_AGE`
      }
      if (!is.null(self$`SHOPPING_RETARGETING`)) {
        TargetingSpecObject[["SHOPPING_RETARGETING"]] <-
          lapply(self$`SHOPPING_RETARGETING`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`TARGETING_STRATEGY`)) {
        TargetingSpecObject[["TARGETING_STRATEGY"]] <-
          self$`TARGETING_STRATEGY`
      }
      return(TargetingSpecObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingSpec
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingSpec
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`AGE_BUCKET`)) {
        self$`AGE_BUCKET` <- ApiClient$new()$deserializeObj(this_object$`AGE_BUCKET`, "array[TargetingSpecAgeBucket]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`APPTYPE`)) {
        self$`APPTYPE` <- ApiClient$new()$deserializeObj(this_object$`APPTYPE`, "array[TargetingSpecAppType]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`AUDIENCE_EXCLUDE`)) {
        self$`AUDIENCE_EXCLUDE` <- ApiClient$new()$deserializeObj(this_object$`AUDIENCE_EXCLUDE`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`AUDIENCE_INCLUDE`)) {
        self$`AUDIENCE_INCLUDE` <- ApiClient$new()$deserializeObj(this_object$`AUDIENCE_INCLUDE`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`GENDER`)) {
        self$`GENDER` <- ApiClient$new()$deserializeObj(this_object$`GENDER`, "array[TargetingSpecGender]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`GEO`)) {
        self$`GEO` <- ApiClient$new()$deserializeObj(this_object$`GEO`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`INTEREST`)) {
        self$`INTEREST` <- ApiClient$new()$deserializeObj(this_object$`INTEREST`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`LOCALE`)) {
        self$`LOCALE` <- ApiClient$new()$deserializeObj(this_object$`LOCALE`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`LOCATION`)) {
        self$`LOCATION` <- ApiClient$new()$deserializeObj(this_object$`LOCATION`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`MAXIMUM_AGE`)) {
        self$`MAXIMUM_AGE` <- this_object$`MAXIMUM_AGE`
      }
      if (!is.null(this_object$`MINIMUM_AGE`)) {
        self$`MINIMUM_AGE` <- this_object$`MINIMUM_AGE`
      }
      if (!is.null(this_object$`SHOPPING_RETARGETING`)) {
        self$`SHOPPING_RETARGETING` <- ApiClient$new()$deserializeObj(this_object$`SHOPPING_RETARGETING`, "array[TargetingSpecShoppingRetargeting]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`TARGETING_STRATEGY`)) {
        self$`TARGETING_STRATEGY` <- ApiClient$new()$deserializeObj(this_object$`TARGETING_STRATEGY`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TargetingSpec in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TargetingSpec
    #'
    #' @param input_json the JSON input
    #' @return the instance of TargetingSpec
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`AGE_BUCKET` <- ApiClient$new()$deserializeObj(this_object$`AGE_BUCKET`, "array[TargetingSpecAgeBucket]", loadNamespace("openapi"))
      self$`APPTYPE` <- ApiClient$new()$deserializeObj(this_object$`APPTYPE`, "array[TargetingSpecAppType]", loadNamespace("openapi"))
      self$`AUDIENCE_EXCLUDE` <- ApiClient$new()$deserializeObj(this_object$`AUDIENCE_EXCLUDE`, "array[character]", loadNamespace("openapi"))
      self$`AUDIENCE_INCLUDE` <- ApiClient$new()$deserializeObj(this_object$`AUDIENCE_INCLUDE`, "array[character]", loadNamespace("openapi"))
      self$`GENDER` <- ApiClient$new()$deserializeObj(this_object$`GENDER`, "array[TargetingSpecGender]", loadNamespace("openapi"))
      self$`GEO` <- ApiClient$new()$deserializeObj(this_object$`GEO`, "array[character]", loadNamespace("openapi"))
      self$`INTEREST` <- ApiClient$new()$deserializeObj(this_object$`INTEREST`, "array[character]", loadNamespace("openapi"))
      self$`LOCALE` <- ApiClient$new()$deserializeObj(this_object$`LOCALE`, "array[character]", loadNamespace("openapi"))
      self$`LOCATION` <- ApiClient$new()$deserializeObj(this_object$`LOCATION`, "array[character]", loadNamespace("openapi"))
      self$`MAXIMUM_AGE` <- this_object$`MAXIMUM_AGE`
      self$`MINIMUM_AGE` <- this_object$`MINIMUM_AGE`
      self$`SHOPPING_RETARGETING` <- ApiClient$new()$deserializeObj(this_object$`SHOPPING_RETARGETING`, "array[TargetingSpecShoppingRetargeting]", loadNamespace("openapi"))
      self$`TARGETING_STRATEGY` <- ApiClient$new()$deserializeObj(this_object$`TARGETING_STRATEGY`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to TargetingSpec and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TargetingSpec
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`MAXIMUM_AGE`, "^\\d+\\+?$")) {
        return(FALSE)
      }

      if (!str_detect(self$`MINIMUM_AGE`, "^\\d+$")) {
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
      if (!str_detect(self$`MAXIMUM_AGE`, "^\\d+\\+?$")) {
        invalid_fields["MAXIMUM_AGE"] <- "Invalid value for `MAXIMUM_AGE`, must conform to the pattern ^\\d+\\+?$."
      }

      if (!str_detect(self$`MINIMUM_AGE`, "^\\d+$")) {
        invalid_fields["MINIMUM_AGE"] <- "Invalid value for `MINIMUM_AGE`, must conform to the pattern ^\\d+$."
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
# TargetingSpec$unlock()
#
## Below is an example to define the print function
# TargetingSpec$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TargetingSpec$lock()

