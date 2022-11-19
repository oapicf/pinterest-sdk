# do not import all endpoints into this module because that uses a lot of memory and stack frames
# if you need the ability to import all endpoints from this module, import them with
# from pinterestsdk.paths.terms_suggested import Api

from pinterestsdk.paths import PathValues

path = PathValues.TERMS_SUGGESTED