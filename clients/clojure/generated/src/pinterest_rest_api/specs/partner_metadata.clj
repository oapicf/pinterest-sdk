(ns pinterest-rest-api.specs.partner-metadata
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def partner-metadata-data
  {
   (ds/opt :subscriber_key) string?
   })

(def partner-metadata-spec
  (ds/spec
    {:name ::partner-metadata
     :spec partner-metadata-data}))
