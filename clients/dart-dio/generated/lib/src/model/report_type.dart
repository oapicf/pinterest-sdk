//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'report_type.g.dart';

class ReportType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'SYNC')
  static const ReportType SYNC = _$SYNC;
  @BuiltValueEnumConst(wireName: r'ASYNC')
  static const ReportType ASYNC = _$ASYNC;

  static Serializer<ReportType> get serializer => _$reportTypeSerializer;

  const ReportType._(String name): super(name);

  static BuiltSet<ReportType> get values => _$values;
  static ReportType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ReportTypeMixin = Object with _$ReportTypeMixin;

