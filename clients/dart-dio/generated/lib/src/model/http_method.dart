//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'http_method.g.dart';

class HttpMethod extends EnumClass {

  /// HTTP request method.
  @BuiltValueEnumConst(wireName: r'GET')
  static const HttpMethod GET = _$GET;
  /// HTTP request method.
  @BuiltValueEnumConst(wireName: r'HEAD')
  static const HttpMethod HEAD = _$HEAD;
  /// HTTP request method.
  @BuiltValueEnumConst(wireName: r'POST')
  static const HttpMethod POST = _$POST;
  /// HTTP request method.
  @BuiltValueEnumConst(wireName: r'PUT')
  static const HttpMethod PUT = _$PUT;
  /// HTTP request method.
  @BuiltValueEnumConst(wireName: r'DELETE')
  static const HttpMethod DELETE = _$DELETE;
  /// HTTP request method.
  @BuiltValueEnumConst(wireName: r'CONNECT')
  static const HttpMethod CONNECT = _$CONNECT;
  /// HTTP request method.
  @BuiltValueEnumConst(wireName: r'OPTIONS')
  static const HttpMethod OPTIONS = _$OPTIONS;
  /// HTTP request method.
  @BuiltValueEnumConst(wireName: r'TRACE')
  static const HttpMethod TRACE = _$TRACE;
  /// HTTP request method.
  @BuiltValueEnumConst(wireName: r'PATCH')
  static const HttpMethod PATCH = _$PATCH;

  static Serializer<HttpMethod> get serializer => _$httpMethodSerializer;

  const HttpMethod._(String name): super(name);

  static BuiltSet<HttpMethod> get values => _$values;
  static HttpMethod valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class HttpMethodMixin = Object with _$HttpMethodMixin;

