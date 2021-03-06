Release 1.5.0
-------------
- Add `toVavr` method to `Opt`
- Please note that this version now depends on vavr.io and requires Java 8

Release 1.4.2
-------------
- Improve exception handling for JSON fields (#12)

Release 1.4.1
-------------
- Fix next() of stream iterator (threw NoSuchElementException if hasNext() has not been called before)

Release 1.4
-----------

- Empty JSON arrays and arrays containing only zeros are not considered zero anymore.
  As a result, object fields are not removed anymore but have an empty array as value.

Release 1.3.2
-------------

- Make functions of `SimpleSerializer` available via instance variable.

Release 1.3.1
-------------

- Fix type cast bug in `JArray#toArray`.

Release 1.3
-----------

Most of the work has been done on the Jsons package.

- Fix parameter types of immutable check methods (see `Immutables`).
- Add `#toArray` and `#toMap` methods to `JArray` and `JObject`. 
- Rename types in Jsons package to better reflect the type hierarchy. `JArrayWrite` -> `JArray`, `JObjectWrite` -> `JObject`, `JField` -> `Field`, `JZero` -> `Zero`.
- Generalize JSON Serializer API from `Writer` to `OutputStream`.
- Make various Jsons functions final.
- Simplify Jsons field and array construction by adding constructor functions that take plain (unwrapped) values.


Release 1.2
-----------

Most of the work has been done on the Jsons package.

### Breaking Changes

- Add missing or else methods to `Opt`.
  `#or` got renamed to `#getOr` to make room for the new methods.
- Rename function and effect apply method from `ap` to `apply`.
- Rename and change signature of `Jsons.vN` to take a null value.
     
### Changes

- Add method to lift a plain function into the context of an Opt.
- Remove the `Require-Capability` OSGi header to allow the lib to be used in a Java 8 environment.
- Implement `#toString` on both `JObjectWrite` and `JArrayWrite`.

### Fixes
     
- Fix merge methods in Jsons.
- Improve documentation of Jsons.
- Fix implementation of `Jsons.vN` to handle all JSON types, not only strings.
- Add delegation of `#equals` and `#hashCode` in some collection wrappers.
  The lack broke e.g. equality in the Jsons lib.  
   

Release 1.1.1
-------------

No release notes available



