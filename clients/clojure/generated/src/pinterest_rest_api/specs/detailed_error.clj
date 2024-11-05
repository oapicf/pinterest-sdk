(ns pinterest-rest-api.specs.detailed-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def detailed-error-data
  {
   (ds/req :code) int?
   (ds/req :message) string?
   (ds/req :details) any?
   })

(def detailed-error-spec
  (ds/spec
    {:name ::detailed-error
     :spec detailed-error-data}))
