/*
 * Copyright (c) 2012, 2019, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * COPYRIGHT AND PERMISSION NOTICE
 *
 * Copyright (C) 1991-2016 Unicode, Inc. All rights reserved.
 * Distributed under the Terms of Use in 
 * http://www.unicode.org/copyright.html.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of the Unicode data files and any associated documentation
 * (the "Data Files") or Unicode software and any associated documentation
 * (the "Software") to deal in the Data Files or Software
 * without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, and/or sell copies of
 * the Data Files or Software, and to permit persons to whom the Data Files
 * or Software are furnished to do so, provided that
 * (a) this copyright and permission notice appear with all copies 
 * of the Data Files or Software,
 * (b) this copyright and permission notice appear in associated 
 * documentation, and
 * (c) there is clear notice in each modified Data File or in the Software
 * as well as in the documentation associated with the Data File(s) or
 * Software that the data or software has been modified.
 *
 * THE DATA FILES AND SOFTWARE ARE PROVIDED "AS IS", WITHOUT WARRANTY OF
 * ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT OF THIRD PARTY RIGHTS.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS INCLUDED IN THIS
 * NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR CONSEQUENTIAL
 * DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 * DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
 * TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
 * PERFORMANCE OF THE DATA FILES OR SOFTWARE.
 *
 * Except as contained in this notice, the name of a copyright holder
 * shall not be used in advertising or otherwise to promote the sale,
 * use or other dealings in these Data Files or Software without prior
 * written authorization of the copyright holder.
 */

package sun.text.resources.cldr.ext;

import java.util.ListResourceBundle;

public class FormatData_nl extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_MonthNames = new String[] {
               "januari",
               "februari",
               "maart",
               "april",
               "mei",
               "juni",
               "juli",
               "augustus",
               "september",
               "oktober",
               "november",
               "december",
               "",
            };
        final String[] metaValue_MonthAbbreviations = new String[] {
               "jan.",
               "feb.",
               "mrt.",
               "apr.",
               "mei",
               "jun.",
               "jul.",
               "aug.",
               "sep.",
               "okt.",
               "nov.",
               "dec.",
               "",
            };
        final String[] metaValue_MonthNarrows = new String[] {
               "J",
               "F",
               "M",
               "A",
               "M",
               "J",
               "J",
               "A",
               "S",
               "O",
               "N",
               "D",
               "",
            };
        final String[] metaValue_DayNames = new String[] {
               "zondag",
               "maandag",
               "dinsdag",
               "woensdag",
               "donderdag",
               "vrijdag",
               "zaterdag",
            };
        final String[] metaValue_DayAbbreviations = new String[] {
               "zo",
               "ma",
               "di",
               "wo",
               "do",
               "vr",
               "za",
            };
        final String[] metaValue_DayNarrows = new String[] {
               "Z",
               "M",
               "D",
               "W",
               "D",
               "V",
               "Z",
            };
        final String[] metaValue_QuarterNames = new String[] {
               "1e kwartaal",
               "2e kwartaal",
               "3e kwartaal",
               "4e kwartaal",
            };
        final String[] metaValue_QuarterAbbreviations = new String[] {
               "K1",
               "K2",
               "K3",
               "K4",
            };
        final String[] metaValue_AmPmMarkers = new String[] {
               "a.m.",
               "p.m.",
            };
        final String[] metaValue_TimePatterns = new String[] {
               "HH:mm:ss zzzz",
               "HH:mm:ss z",
               "HH:mm:ss",
               "HH:mm",
            };
        final String[] metaValue_buddhist_QuarterNarrows = new String[] {
               "1",
               "2",
               "3",
               "4",
            };
        final String[] metaValue_buddhist_long_Eras = new String[] {
               "BC",
               "BE",
            };
        final String[] metaValue_java_time_buddhist_DatePatterns = new String[] {
               "EEEE d MMMM y G",
               "d MMMM y G",
               "d MMM y G",
               "dd-MM-yy GGGGG",
            };
        final String[] metaValue_buddhist_DatePatterns = new String[] {
               "EEEE d MMMM y GGGG",
               "d MMMM y GGGG",
               "d MMM y GGGG",
               "dd-MM-yy G",
            };
        final String[] metaValue_roc_long_Eras = new String[] {
               "voor R.O.C.",
               "Minguo",
            };
        final String[] metaValue_islamic_Eras = new String[] {
               "",
               "AH",
            };
        final String metaValue_calendarname_gregorian = "Gregoriaanse kalender";
        final String[] metaValue_brah_NumberElements = new String[] {
               ",",
               ".",
               ";",
               "%",
               "0",
               "#",
               "-",
               "E",
               "\u2030",
               "\u221e",
               "NaN",
            };
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "field.year", "jaar" },
            { "calendarname.islamic-umalqura", "Islamitische kalender (Umm al-Qura)" },
            { "arabext.NumberElements",
                new String[] {
                    "\u066b",
                    "\u066c",
                    "\u061b",
                    "\u066a",
                    "\u06f0",
                    "#",
                    "\u200e-\u200e",
                    "\u00d7\u06f1\u06f0^",
                    "\u0609",
                    "\u221e",
                    "NaN",
                }
            },
            { "japanese.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.narrow.Eras", metaValue_buddhist_long_Eras },
            { "AmPmMarkers", metaValue_AmPmMarkers },
            { "java.time.japanese.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "standalone.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.QuarterNames", metaValue_QuarterNames },
            { "lana.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u1a80",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "roc.MonthNarrows", metaValue_MonthNarrows },
            { "calendarname.islamic-civil", "Islamitische kalender (cyclisch)" },
            { "islamic.narrow.AmPmMarkers", metaValue_AmPmMarkers },
            { "mymr.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u1040",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "japanese.TimePatterns", metaValue_TimePatterns },
            { "roc.long.Eras", metaValue_roc_long_Eras },
            { "narrow.Eras",
                new String[] {
                    "v.C.",
                    "n.C.",
                }
            },
            { "talu.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u19d0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "timezone.regionFormat.standard", "standaardtijd {0}" },
            { "tamldec.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u0be6",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "japanese.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "calendarname.japanese", "Japanse kalender" },
            { "mtei.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\uabf0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "standalone.DayAbbreviations", metaValue_DayAbbreviations },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "beng.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u09e6",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "long.Eras",
                new String[] {
                    "voor Christus",
                    "na Christus",
                }
            },
            { "saur.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\ua8d0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "islamic.DayNames", metaValue_DayNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "DateTimePatterns",
                new String[] {
                    "{1} 'om' {0}",
                    "{1} 'om' {0}",
                    "{1} {0}",
                    "{1} {0}",
                }
            },
            { "narrow.AmPmMarkers", metaValue_AmPmMarkers },
            { "latn.NumberElements", metaValue_brah_NumberElements },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "japanese.DatePatterns", metaValue_buddhist_DatePatterns },
            { "guru.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u0a66",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "buddhist.DayNames", metaValue_DayNames },
            { "field.minute", "minuut" },
            { "field.era", "tijdperk" },
            { "japanese.long.Eras",
                new String[] {
                    "na Christus",
                    "Meiji",
                    "Taish\u014d",
                    "Sh\u014dwa",
                    "Heisei",
                }
            },
            { "buddhist.AmPmMarkers", metaValue_AmPmMarkers },
            { "field.dayperiod", "a.m./p.m." },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "cham.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\uaa50",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "islamic.MonthNames",
                new String[] {
                    "Moeharram",
                    "Safar",
                    "Rabi\u02bba al awal",
                    "Rabi\u02bba al thani",
                    "Joemad\u02bbal awal",
                    "Joemad\u02bbal thani",
                    "Rajab",
                    "Sja\u02bbaban",
                    "Ramadan",
                    "Sjawal",
                    "Doe al ka\u02bbaba",
                    "Doe al hizja",
                    "",
                }
            },
            { "arab.NumberElements",
                new String[] {
                    "\u066b",
                    "\u066c",
                    "\u061b",
                    "\u066a\u061c",
                    "\u0660",
                    "#",
                    "\u061c-",
                    "\u0627\u0633",
                    "\u0609",
                    "\u221e",
                    "NaN",
                }
            },
            { "shrd.NumberElements", metaValue_brah_NumberElements },
            { "takr.NumberElements", metaValue_brah_NumberElements },
            { "calendarname.roc", "Kalender van de Chinese Republiek" },
            { "islamic.DatePatterns", metaValue_buddhist_DatePatterns },
            { "deva.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u0966",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "roc.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "islamic.Eras", metaValue_islamic_Eras },
            { "field.month", "maand" },
            { "osma.NumberElements", metaValue_brah_NumberElements },
            { "roc.Eras", metaValue_roc_long_Eras },
            { "field.second", "seconde" },
            { "DayAbbreviations", metaValue_DayAbbreviations },
            { "DayNarrows", metaValue_DayNarrows },
            { "NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u00a4\u00a0#,##0.00;\u00a4\u00a0-#,##0.00",
                    "#,##0%",
                }
            },
            { "roc.DatePatterns", metaValue_buddhist_DatePatterns },
            { "calendarname.islamic", "Islamitische kalender" },
            { "knda.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u0ce6",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "bali.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u1b50",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "japanese.narrow.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.TimePatterns", metaValue_TimePatterns },
            { "brah.NumberElements", metaValue_brah_NumberElements },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "timezone.regionFormat", "{0}-tijd" },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "0 duizend",
                    "00 duizend",
                    "000 duizend",
                    "0 miljoen",
                    "00 miljoen",
                    "000 miljoen",
                    "0 miljard",
                    "00 miljard",
                    "000 miljard",
                    "0 biljoen",
                    "00 biljoen",
                    "000 biljoen",
                }
            },
            { "roc.narrow.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "standalone.QuarterNames", metaValue_QuarterNames },
            { "olck.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u1c50",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "japanese.MonthNarrows", metaValue_MonthNarrows },
            { "islamic.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.DayAbbreviations", metaValue_DayAbbreviations },
            { "standalone.DayNarrows", metaValue_DayNarrows },
            { "mymrshan.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u1090",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "islamic.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.long.Eras", metaValue_buddhist_long_Eras },
            { "mlym.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u0d66",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "java.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\ua9d0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "TimePatterns", metaValue_TimePatterns },
            { "lepc.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u1c40",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "fullwide.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\uff10",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "islamic.DayNarrows", metaValue_DayNarrows },
            { "khmr.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u17e0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "field.zone", "tijdzone" },
            { "japanese.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.narrow.Eras", metaValue_roc_long_Eras },
            { "laoo.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u0ed0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "sund.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u1bb0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "thai.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u0e50",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "buddhist.narrow.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "Eras",
                new String[] {
                    "v.Chr.",
                    "n.Chr.",
                }
            },
            { "kali.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\ua900",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "roc.DayNames", metaValue_DayNames },
            { "islamic.QuarterNames", metaValue_QuarterNames },
            { "islamic.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "mong.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u1810",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "java.time.islamic.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "field.weekday", "dag van de week" },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic.DayAbbreviations", metaValue_DayAbbreviations },
            { "islamic.long.Eras",
                new String[] {
                    "",
                    "Sa\u02bbna Hizjria",
                }
            },
            { "japanese.QuarterNames", metaValue_QuarterNames },
            { "buddhist.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "telu.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u0c66",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "nkoo.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u07c0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "cakm.NumberElements", metaValue_brah_NumberElements },
            { "tibt.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u0f20",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "japanese.DayNames", metaValue_DayNames },
            { "japanese.DayAbbreviations", metaValue_DayAbbreviations },
            { "DayNames", metaValue_DayNames },
            { "lanatham.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u1a90",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "buddhist.DatePatterns", metaValue_buddhist_DatePatterns },
            { "roc.MonthNames", metaValue_MonthNames },
            { "sora.NumberElements", metaValue_brah_NumberElements },
            { "buddhist.Eras", metaValue_buddhist_long_Eras },
            { "field.week", "week" },
            { "gujr.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u0ae6",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "buddhist.MonthNarrows", metaValue_MonthNarrows },
            { "buddhist.QuarterNames", metaValue_QuarterNames },
            { "islamic.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "limb.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u1946",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "roc.DayNarrows", metaValue_DayNarrows },
            { "orya.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\u0b66",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "roc.AmPmMarkers", metaValue_AmPmMarkers },
            { "java.time.roc.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "0K",
                    "00K",
                    "000K",
                    "0\u00a0mln'.'",
                    "00\u00a0mln'.'",
                    "000\u00a0mln'.'",
                    "0\u00a0mld'.'",
                    "00\u00a0mld'.'",
                    "000\u00a0mld'.'",
                    "0\u00a0bln'.'",
                    "00\u00a0bln'.'",
                    "000\u00a0bln'.'",
                }
            },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "timezone.regionFormat.daylight", "zomertijd {0}" },
            { "DatePatterns",
                new String[] {
                    "EEEE d MMMM y",
                    "d MMMM y",
                    "d MMM y",
                    "dd-MM-yy",
                }
            },
            { "buddhist.DayAbbreviations", metaValue_DayAbbreviations },
            { "islamic.TimePatterns", metaValue_TimePatterns },
            { "japanese.DateTimePatterns",
                new String[] {
                    "{1} {0}",
                    "{1} {0}",
                    "{1} {0}",
                    "{1} {0}",
                }
            },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "standalone.DayNames", metaValue_DayNames },
            { "field.hour", "uur" },
            { "vaii.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "\ua620",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                }
            },
            { "islamic.MonthAbbreviations",
                new String[] {
                    "Moeh.",
                    "Saf.",
                    "Rab. I",
                    "Rab. II",
                    "Joem. I",
                    "Joem. II",
                    "Raj.",
                    "Sja.",
                    "Ram.",
                    "Sjaw.",
                    "Doe al k.",
                    "Doe al h.",
                    "",
                }
            },
            { "islamic.narrow.Eras", metaValue_islamic_Eras },
            { "calendarname.buddhist", "Boeddhistische kalender" },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "buddhist.DayNarrows", metaValue_DayNarrows },
            { "japanese.DayNarrows", metaValue_DayNarrows },
            { "QuarterNames", metaValue_QuarterNames },
            { "roc.TimePatterns", metaValue_TimePatterns },
            { "QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "japanese.Eras",
                new String[] {
                    "n.Chr.",
                    "Meiji",
                    "Taish\u014d",
                    "Sh\u014dwa",
                    "Heisei",
                }
            },
            { "roc.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
        };
        return data;
    }
}