(ns pinterest-rest-api.specs.quality-component-issue
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def quality-component-issue-data
  {
   (ds/req :id) string?
   (ds/req :name) string?
   (ds/req :reason) string?
   })

(def quality-component-issue-spec
  (ds/spec
    {:name ::quality-component-issue
     :spec quality-component-issue-data}))
