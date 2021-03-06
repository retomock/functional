/*
 * Copyright 2015 Entwine AG, Switzerland
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.entwinemedia.fn;

/** Binary function. */
public abstract class Fn2<A, B, C> {
  /** Function application. */
  public abstract C apply(A a, B b);

  public Fn<A, Fn<B, C>> curry() {
    return Fns.curry(this);
  }

  public Fn2<B, A, C> flip() {
    return Fns.flip(this);
  }

  public Fn<B, C> _1(A a) {
    return Fns._1p(this, a);
  }

  public Fn<A, C> _2(B b) {
    return Fns._2p(this, b);
  }
}
