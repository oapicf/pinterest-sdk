(ns pinterest-rest-api.specs.keyword-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.keyword :refer :all]
            )
  (:import (java.io File)))


(def keyword-error-data
  {
   (ds/opt :data) keyword-spec
   (ds/opt :error_messages) (s/coll-of string?)
   })

(def keyword-error-spec
  (ds/spec
    {:name ::keyword-error
     :spec keyword-error-data}))
