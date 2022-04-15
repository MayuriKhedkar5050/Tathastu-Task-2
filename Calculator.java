<!doctype html>
<html>
<head>
    <title>Online Java Compiler - online editor</title>

    <meta charset="UTF-8">
    <meta name="description" content="OnlineGDB is online IDE with java compiler. Quick and easy way to run java program online.">
    <meta name="keywords" content="online java compiler, execute java online, compile java code online, online java ide">
<meta name="google-site-verification" content="LRk_5wLIzc43hz9wV6QksHTiqYHM1CoAbHZVzigvn9s" />
<meta name="verify-admitad" content="fb09364f2b" />
    <meta property="og:title" content=""/>
    <meta property="og:site_name" content="GDB online Debugger"/>
    <meta property="og:description" content="OnlineGDB is online IDE with java compiler. Quick and easy way to run java program online."/>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="icon" href="/favicon.ico" type="image/x-icon" />
    <!--<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.6/dist/css/bootstrap.min.css">-->
    <!--<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha512-nNo+yCHEyn0smMxSswnf/OnX6/KwJuZTlNZBjauKhTK0c+zT+q5JOCx0UFhXQ6rJR9jg6Es8gPuD2uZcYDLqSw==" crossorigin="anonymous" referrerpolicy="no-referrer" />-->
    <link rel="stylesheet" href="/public/bootstrap/3.3.6/css/bootstrap.min.css"/>

    
    <link rel="stylesheet" href="/public/css/onlinegdb.css?v=19" />
    
    
    <script>  var main_ide =  true;  </script>
    
    
    <script type="text/javascript" src="/public/js/onlinegdb.js?v=8"></script>
    <script type="text/javascript" src="/public/js/ace/ace.js"></script>
    <script type="text/javascript" src="/public/js/ace/ext-language_tools.js"></script>
    <script type="text/javascript" src="/public/js/editor.js?v=6" defer></script>
    <script type="text/javascript" src="/public/js/main.js?v=54" defer></script>
    

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.4/css/bootstrap-select.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.4/js/bootstrap-select.min.js"></script>

    




    
    
    <!--<script src="/public/js/bsa.js?v=4"></script>-->
    <script type="text/javascript">(function(){var bsa_optimize=document.createElement('script');bsa_optimize.type='text/javascript';bsa_optimize.async=true;bsa_optimize.src='https://cdn-s2s.buysellads.net/pub/onlinegdb.js?'+(new Date()-new Date()%3600000);(document.getElementsByTagName('head')[0]||document.getElementsByTagName('body')[0]).appendChild(bsa_optimize);})();</script>
    <script type="text/javascript" src="//m.servedby-buysellads.com/monetization.js"></script>
    

    
<style type="text/css">
            html, body {
                height: 100%;
                min-height: 100%;
                margin: 0;
                padding: 0;
            }
            .split-pane-divider{
                background: #aaa;
            }
            
            #left-component {
                width: 20%;
/*                min-width: 20vw;
                max-width: 20vw;*/
                background-color: #337ab7;
            }
            #right-left-component {
                width: 100%;
                background-color: #f5f5f5;
            }
            #right-right-component {
                left: 100%;
                margin-left:1px;
                /*min-width: 15em;*/
                background-color: #f5f5f5;
            }
            #top-component {
                height: 75%;
                position: relative;
                background-color: #f5f5f5;
            }
            #my-divider {
                left: 20%; /* Same as left component width */
                width: 2px;
            }
            #my-divider1 {
				top: 75%;
				height: 7px;
                background-color:#bdbdbd;
			}
            #my-divider2 {
                left: 100%; /* Same as left component width */
                width: 1px;
            }
            #bottom-component {
                background-color: #f5f5f5;
                top:75%;
                margin-top: 1px;
            }
            #right-component {
                background-color: #f5f5f5;
/*                max-width:80vw;
                min-width:80vw;
                min-width:17em;*/
                
                left: 20%;  /* Same as left component width */
                
                /*margin-left: 2px;  /* Same as divider width */
            }
            @media only screen and (max-width: 760px) {
                #mobile_test_element { display: none; }
            }
        </style>
        
</head>

<body 

>
        <span id="mobile_test_element" ></span>
    <div class="container" style="width:100%;padding:0px;margin:0px">

    <div class="col-sm-12" style="margin:0px;padding:0px">
        <div style="height:100vh">
<div class="split-pane fixed-left">
    <div class="split-pane-component " id="left-component" style="background-color: #125792;">
        <div style="background-color: #125792; padding:10px 0px 0px 0px">
          
          <a id="btn_close_header" onclick="fold_left_bar();"><span class="glyphicon glyphicon-menu-left" aria-hidden="true" style="z-index:100;background-color:#0f3a5f;padding:20px 0px;"></span>
          
          <h4 id="header_logo" style="width:100%;text-align:center;margin:0px; border-bottom: 0px solid #94c5ee; padding-bottom: 0px;">
            <a  href="/">
              <span class="glyphicon glyphicon-flash" style="padding: 5px; border: 3px solid;" aria-hidden="true"></span> 
              <span class="to_be_hidden">
          &nbsp;&nbsp;OnlineGDB <sup> beta</sup>
          </span>
          </a>
          </h4>
          
          <span class="tagline to_be_hidden">
              <h1 style="font-size:12px;padding:0px; margin:0px">
                  
                  online compiler and debugger for c/c++
                  
                </h1>
        </span>
          </div>
          <div class="to_be_hidden">
          <div style="text-align: center;    color: #ccd7dd;    padding: 10px 0px;    font-style: italic;    border-top: 1px solid #658a9e;    border-bottom: 1px solid #658a9e;">
              
              code. compile. run. debug. share.
              
          </div>
          
          <ul class="nav nav-tabs nav-stacked text-center" style="background-color: #337ab7; border-bottom:1px solid #658a9e">
                
                <li id="navbar-ide"><a href="/">IDE</a></li>
                
                <li ><a href="/myfiles">My Projects</a></li>
                
                <!--<li ><a href="/s/">Student</a></li>-->
                <li ><a href="/classroom">Classroom <span class="label label-danger">new</span></a></li>
                
                <li ><a href="http://learn.onlinegdb.com">Learn Programming</a></li>
                <li ><a href="http://question.onlinegdb.com">Programming Questions</a></li>
                
                
<!--
                <li ><a href="/opportunity">Opportunity for Intern <span class="label label-danger">new</span></a></li>
-->
<!--                <li ><a href="/career">We are Hiring</a></li> -->
                
                <!--
                <li ><a href="/career">Jobs <span class="label label-danger">new</span></a></li>
                -->
                
                <li><a href="/register">Sign Up</a></li>
                <li id="login_logout_span"><a href="/login">Login</a></li>
                
          </ul>
        <div class="addthis_inline_share_toolbox"></div>
        
        <!--
        <center>
        <script src="https://donorbox.org/install-popup-button.js" type="text/javascript" defer></script>
<a class="dbox-donation-button" href="https://donorbox.org/donate-to-onlinegdb" style="background:#5cb85c url(https://d1iczxrky3cnb2.cloudfront.net/white_logo.png) no-repeat 18px center; color: #fff;text-decoration: none;font-family: Verdana,sans-serif;display: inline-block;font-size: 14px;padding: 6px 17px 6px 56px; -webkit-border-radius: 2px; -moz-border-radius: 2px; border-radius: 2px; box-shadow: 0 1px 0 0 #408040; text-shadow: 0 1px rgba(0, 0, 0, 0.3);" >Donate</a>
</center> -->
<center>
    <div id="ad_wrapper">
    
    
    
    <script type="text/javascript">var do_fallback_ad_check = true;</script>
    
    
    <script type="text/javascript">var no_ads = false; </script>
    
    <script async type="text/javascript" src="//cdn.carbonads.com/carbon.js?serve=CKYI5KJI&placement=onlinegdbcom" id="_carbonads_js"></script> 
    
    </div>
</center>
        
        <footer class="container-fluid text-center" style="bottom:0px;left:0px;right:0px;position:absolute;padding:3px;">
        <style type="text/css">
#footer a {
    font-weight: normal;
    text-decoration: none;
}
#footer a:hover {
    color:white;
    text-decoration: underline;
}
</style>
<div id="footer">
    <span class="text-center" style="font-weight:normal; border-bottom:1px solid #658a9e">
        <a href="/about">About</a>
        &bull; <a href="/faq" >FAQ</a>
        &bull; <a href="/blog/" >Blog</a>
        <!--<li ><a href="/contact?cat=feature" >Feature Request</a></li>-->
        <!--<li ><a href="/contact?cat=bug" >Report Bug</a></li> -->
        &bull; <a href="/termsofuse" >Terms of Use</a> 
        &bull; <a href="/contact" >Contact Us</a>
        &bull; <a href="http://www.gdbtutorial.com/" target='_blank' >GDB Tutorial</a>
        &bull; <a href="/credits"> Credits </a></span>
        &bull; <a href="/privacy"> Privacy </a></span>
    <div style="clear:both"></div>
        <!--<li><a href="http://www.whizcoder.com/" target='_blank' >Online Java/Python Debugger</a></li>-->
    
<span style="float:none;clear:both">&copy; 2016 - 2022 GDB Online</span>
</div>
        </footer>
        
        </div>
    </div>
    <div class="split-pane-divider hide" id="my-divider"></div>
    <div class="split-pane-component" id="right-component">

        <script src="/public/js/jsdos/6.22.59/js-dos.js"></script>
        
        <input type="hidden" id="snippet_id" value="">
        <input type="hidden" id="sub_user_id" value="">


        <div class="split-pane fixed-left">
            <div class="split-pane-component" id="right-left-component">
                <div class="split-pane fixed-top">
                    <div class="split-pane-component" id="top-component">
                        <!-- middle top start --> 
                        <div id="native-inline"></div>
                        <div id="editor-container">
                            
    <a name="title-bar"></a>
    <div id="title-bar" style="padding:0px 5px;min-width:900px">
        <div id="connectingMessage" class="loadingdots" style="display:none">connecting to server </div>
        <div style="position:relative">
            <!--<span class="col-sm-3" style="float:left"><b>Source Code</b></span>-->
            <span class="col-sm-63" id="control-bar" style="float:left">
                
                <span id="project_title" class="hide">
                     Source Code &nbsp;&nbsp;
                </span>
                
                
                
                <div class="btn-group">
                <button type="button" id="control-btn-newfile" class="btn btn-default btn-half" data-placement="right" data-toggle="tooltip" title="New File (Ctrl+M)"><span class="glyphicon glyphicon-file"></span></button>
                <button type="button" id="control-btn-upload" class="btn btn-default btn-half" data-placement="bottom" data-toggle="tooltip" title="Upload File"><span class="glyphicon glyphicon-cloud-upload"></span></button>
                </div>

                <span id="upload_file_container" class="hide"></span>
                
                <button type="submit" id="control-btn-run" class="btn btn-success" onclick="ide.runcode();" disabled="disabled" data-placement="bottom" data-toggle="tooltip" title="F9">
                    <span class="glyphicon glyphicon-play" aria-hidden="true" ></span> Run</button>
                
                <button type="submit" id="control-btn-debug" class="btn btn-primary" onclick="ide.debugcode();" disabled="disabled" data-placement="bottom" data-toggle="tooltip" title="F8">
                    <span class="glyphicon glyphicon-play-circle" aria-hidden="true" ></span> Debug</button>
                <button type="submit" id="control-btn-stop" class="btn btn-danger" disabled="disabled" onclick="pstop(); ">   <span class="glyphicon glyphicon-stop" aria-hidden="true"></span> Stop</button>
                <!--<button type="submit" id="control-btn-save" class="btn btn-warning" onclick="idesave(editor.getValue())"> <span class="glyphicon glyphicon-floppy-save" aria-hidden="true"></span> Save</button>-->
                
                
                <button type="submit" id="control-btn-share" class="btn btn-warning" disabled="disabled" onclick="shareCode()"> <span class="glyphicon glyphicon-share" aria-hidden="true"></span> Share</button>
                
                
                <button type="button" id="control-btn-save" class="btn btn-primary" disabled="disabled" data-placement="bottom" data-toggle="tooltip" title="Ctrl+S"> <span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> <span class="btn_text">Save</span></button>
                
                
                
                <button type="submit" id="control-btn-beautify" class="btn btn-info" disabled="disabled"  onclick="beautifyCode()" data-placement="bottom" data-toggle="tooltip" title="Ctrl+B">{ } Beautify</button>
                
                
                <button type="button" id="control-btn-download" class="btn btn-info" disabled="disabled" onclick="downloadCode()" title="Download Code" data-placement="bottom" data-toggle="tooltip" title="Ctrl+B"><span class="glyphicon glyphicon-save" aria-hidden="true"></span></button>
                


                
                
                
                
            </span>
            

            
            <span class="col-sm-64">
                
                    <span class=""  style="float:right;padding-right:50px;">
                
                Language
                <select id="lang-select" class="form-control" style="width:90px; display:inline; border-radius:0px;"
                        >
                        
                  <option disabled value> -- select -- </option>
                  <option  value="c">C</option>
<!--                  <option  value="c99">C99</option>-->
                  <option  value="c++">C++</option>
<!--                  <option  value="c++11">C++ 11</option> -->
                  <option  value="c++14">C++ 14</option>
                  <option  value="c++17">C++ 17</option>
                  <option  value="c++20">C++ 20</option>
                  
                  <option  value="c_tc">C (TurboC)</option>
                  <option  value="c++_tc">C++ (TurboC)</option>
                  
                  <option selected value="java">Java</option>
                  <option  value="python">Python 3</option>
                  <option  value="php">PHP</option>
                  <option  value="c#">C#</option>
                  <option  value="vb">VB</option>
                  <option  value="html">HTML,JS,CSS</option>
                  <option  value="ruby">Ruby</option>
                  <option  value="perl">Perl</option>
                  <option  value="pascal">Pascal</option>
                  <option  value="r">R</option>
                  <option  value="fortran">Fortran</option>
                  <option  value="haskell">Haskell</option>
                  <option  value="asm_gcc">Assembly(GCC)</option>
                  <option  value="objc">Objective C</option>
                  <option  value="sqlite3">SQLite</option>
                  <option  value="js_rhino">Javascript(Rhino)</option>
                  <option  value="prolog">Prolog</option>
                  <option  value="swift">Swift</option>
                  
                  <option  value="rust">Rust</option>
                  <option  value="go">Go</option>
                  
                  <option  value="bash">Bash</option> 
                </select>
                
                <button type="submit" class="btn btn-warning" onclick="ide.showinfo();">
                    <span class="glyphicon glyphicon-info-sign" aria-hidden="true"></span></button>
                <button type="submit" class="btn btn-warning" onclick="ide.showsettings();">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span></button>
                
                </span>
            </span>
            <div id="popup-settings" style="position:absolute; right:0px; z-index:123;">
                <div>
                    <button type="submit" style="visibility: hidden;" class="btn btn-warning" onclick=""> <span class="glyphicon glyphicon-cog" aria-hidden="true"></span></button>
                </div>
                <div style="background-color:#f0ad4e;padding: 15px;">
                    <p>
                        <form class="form-inline" role="form">
                            <div class="form-group">
                                <label for="settings-editor-theme">Editor Theme:</label>
                                <select class="form-control" id="settings-editor-theme">
                                    <option value="dark">Dark</option>
                                    <option value="light">Light</option>
                                </select>
                            </div>
                        </form>

                    <p>
                        <form class="form-inline" role="form">
                            <div class="form-group">
                                <label for="settings-editor-mode">Editor Mode:</label>
                                <select class="form-control" id="settings-editor-mode">
                                    <option value="textinput">Normal</option>
                                    <option value="emacs">Emacs</option>
                                    <option value="vim">vim</option>
                                </select>
                            </div>
                        </form>

                    <p>
                        <form class="form-inline" role="form">
                            <div class="form-group">
                                <label for="settings-editor-font-size">Font size:</label>
                                <select class="form-control" id="settings-editor-font-size">
                                    <option value="small">Small</option>
                                    <option value="medium" selected='selected'>Medium</option>
                                    <option value="large">Large</option>
                                </select>
                            </div>
                        </form>

                    <p>
                        <form class="form-inline" role="form">
                            <div class="form-group">
                                <label for="settings-editor-tab-space">Tab Space:</label>
                                <select class="form-control" id="settings-editor-tab-space">
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4" selected="selected">4</option>
                                    <option value="5">5</option>
                                    <option value="6">6</option>
                                    <option value="7">7</option>
                                    <option value="8">8</option>
                                </select>
                            </div>
                        </form>
                    <p>
                        <form class="form-nline" role="form">
                            <div class="form-group">
                                <div class="input-group">
                                <label for="setting-editor-autocomplete">Autocomplete: </label>
                                <input type="radio" name="settings-editor-autocomplete" id="settings-editor-autocomplete-on" checked>on
                                <input type="radio" name="settings-editor-autocomplete" id="settings-editor-autocomplete-off">off
                                </div>
                            </div>
                        </form>
                    </p>
                    <p>
                        <form class="form-inline" role="form">
                            <div class="form-group">
                                <button type="button" class="btn btn-primary" style="width:100%;" onclick="display_compiler_flags_box()">Extra Compiler Flags</button> 
                            </div>
                        </form>
        
                    <div>
                        <p>
                        <form role="form" post="#">
                            <button type="button" class="btn btn-default" style="width:100%;" onclick="ide.closesettings();">Done</button>
                        </form>
                    </div>
                </div>
            </div>
            
        </div>
    </div>
    <div id="multi_editor_container">
        <div style="clear:both; background-color:#757575;">
            <ul class="editor_file_tabs nav nav-pills">
                
                    <li class="active">
                        <a href="#editor_1" data-toggle="tab"><span class="filename">Main.java</span>                   
                        </a>
                    </li>
                
            </ul>
        </div>
        <div class="editor_text_panes tab-content clearfix">
            
            
            <div id="editor_1" data-format="S" data-readonly-ranges="" class="tab-pane active editor" 
            style="position: absolute;    width:100%;    top: 52px;    bottom: 0px;">/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press &quot;Run&quot; button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println(&quot;Hello World&quot;);
	}
}
</div>
            
        </div>
    </div>
</div>
                        <!-- middle top end -->
                    </div>
                    <div class="split-pane-divider" id="my-divider1"></div>
                    <div class="split-pane-component" id="bottom-component">
                        <button onclick="toggle_bottom_pane_size()">
                            <span class="btn_minmax glyphicon glyphicon-resize-full" title="Maximize"></span> 
                        </button>       
                        <button onclick="toggle_bottom_pane_size_hide()">
                            <span class="btn_hide glyphicon glyphicon-chevron-down" title="Hide"></span> 
                        </button> 
                        <button onclick="copy_output()">
                            <span class="btn_copy glyphicon glyphicon-copy" title="Copy output to clipboard"></span> 
                        </button>               
                        <!-- middle bottom start -->
                         <div id="console-wrapper" style="">
    <div id="console-fadder">
        <center><img src="/public/img/loading.gif"><img>
        <div class="msg-wrapper"><h4 class="msg">Compiling Program...</h4></div>
        </center>
    </div>
    <div id="console-title-bar">
        <ul class="nav nav-tabs nav-justified">
            <li class="active tab-input"><a data-toggle="tab" href="#tab-stdin">input</a></li>
            <li class="tab-stdout" style="display:none"><a data-toggle="tab" href="#tab-stdout">stdout</a></li>
            <li class="tab-stderr" style="display:none"><a data-toggle="tab" href="#tab-stderr">stderr</a></li>
            <li class="tab-debug" style="display:none"><a data-toggle="tab" href="#tab-debug-console">Debug Console</a></li>
        </ul>
    </div>
    <div id="console-content" class="tab-content">
        <div id="tab-stdin" class="tab-pane fade in active">
            <div id="stdin-wrapper" style="z-index:10;position:absolute;width:100%;height:100%;">
            <div style="height:37px; padding:5px 10px;  position:absolute;left:0px;right:0px;">
            <span style="float:left;width:20%;text-overflow: ellipsis;max-height:100%;overflow:hidden">Command line arguments:</span> <span style="display: block;"><input id="cmd_line_args" style="width:80%" name="cmd_line_args"  value=""/><br>
            </span></div>
            <div class="well"  style="position:absolute; padding-top:0px; width:100%;top:37px; bottom:0px;border-radius:0px;padding:9px;">
                <div style="z-index:1">
                Standard Input: 
                <input type="radio" id="input_method_interactive" name="input_method" value="interactive"  checked> Interactive Console
                    <input style="margin-left:50px;" type="radio" id="input_method_text" name="input_method" value="text"    > Text<br>
                </div>
                    <div id="ad_unit_bottom_wrapper">
                        <div id="ad_unit_bottom">
                            
                            <!-- /8691100/OnlineGDB_S2S_Leaderboard_BTF -->
                            <div id=bsa-zone_1573224210072-0_123456></div>
                            <!--<div id="native-banner" class="native-standard"></div>-->
                            
                        </div>
                    </div>
                    <textarea class="form-control" id="stdinput" placeholder="Enter input to program here" style="height:100%; resize: none;  display:none " ></textarea>
            </div>
            </div>
            <div id="interactive-terminal-container" style="position:absolute; margin:0px;top:0px; bottom:0px; left:0px; right:0px;" class="col-sm-121"></div>

        </div>
        <div id="tab-stdout" class="tab-pane fade">
            <div id="stdout-wrapper" class="well" style="border:none;height:100%;border-radius:0px;padding:9px; margin:0px;"><span id="ide-run-result"></span>
                <div id="stdout-container" style="position: absolute;    top: 30px;    bottom: 0px;    left: 10px;   right: 10px;">
                <pre class="msg" style="position: absolute;    top: 0px;    bottom: 0px;    left: 0px;    right: 0px;background-color: white;"></pre>
                </div>
            </div>
        </div>
        <div id="tab-stderr" class="tab-pane fade">
            <div id="stderr-wrapper" class="well" style="border:none;height:100%;border-radius:0px;padding:9px; margin:0px;"><span id="ide-compile-result"></span>
                <div id="stderr-container" style="position: absolute;    top: 30px;    bottom: 0px;    left: 10px;   right: 10px;">
                <pre class="msg" style="position: absolute;    top: 0px;    bottom: 0px;    left: 0px;    right: 0px;"></pre>
                </div>
            </div>
        </div>
        <div id="tab-debug-console" class="tab-pane fade">
            <div id="debug-console" style="border:none; height:100%; border-radius:0px;padding:0px; margin:0px;">
                <div class="inactive-content" style="color:#bdbdbd; padding-top:15px; text-align:center">
                    <h4>
                    Program is not being debugged. Click "Debug" button to start program in debug mode.
                        </h4>
                </div>
                <span id="debug-bar" style="display:none">
                    <button type="submit" id="debug_btn_run" class="btn btn-success" disabled="true" onclick="ide.debug('run')"><span class="glyphicon glyphicon-eject" aria-hidden="true" title="start"></span> start</button>
                    <button type="submit" id="debug_btn_pause" class="btn btn-warning" disabled="true" onclick="ide.debug('interrupt')"> <span class="glyphicon glyphicon-pause" aria-hidden="true" title="interrupt"></span> pause</button>
                    <button type="submit" id="debug_btn_cont" class="btn btn-primary" disabled="true" onclick="ide.debug('continue')"> <span class="glyphicon glyphicon-play" aria-hidden="true" title="continue"></span> continue</button>
                    <button type="submit" id="debug_btn_next" class="btn btn-primary" disabled="true" onclick="ide.debug('next')"> <span class="glyphicon glyphicon-step-forward" aria-hidden="true" title="next/step over"></span> step over</button>
                    <button type="submit" id="debug_btn_step" class="btn btn-primary" disabled="true" onclick="ide.debug('step')"> <span class="glyphicon glyphicon-forward" aria-hidden="true"  title="step into"></span> step into</button>
                    <button type="submit" id="debug_btn_finish" class="btn btn-primary" disabled="true" onclick="ide.debug('finish')"> <span class="glyphicon glyphicon-fast-forward" aria-hidden="true"  title="finish/step out"></span> step out</button>
                    
                    <a class="btn btn-success" href="https://www.onlinegdb.com/blog/brief-guide-on-how-to-use-onlinegdb-debugger/" target="_blank"> <span class="glyphicon glyphicon-info-sign" aria-hidden="true" title="Help : How to use debugger?"></span> help</a>
                    
                    </span>
                <div class="col-sm-121 active-content" style="position: absolute;    top: 24px;    bottom: 0px;    left: 0px;    right: 0px;">
                <div id="terminal-container" class="col-sm-12"></div>
                </div>

            </div>
        </div>
    </div>

</div>
                        <!-- middle bottom end -->
                    </div>
                </div>
            </div>
            <div class="split-pane-divider" id="my-divider2"></div>
            <div class="split-pane-component" id="right-right-component">                
                <!-- right component start -->
                <div class="col-sm-41" id="debug-pan" style="background-color:#bdbdbd">
                    <div class="panel-group">
  <div class="panel panel-default">
    <div class="panel-heading">
      <h4 class="panel-title">
        <a data-toggle="collapse" class="collapse-toggle" href="#debug_window_call_stack">Call Stack</a>
      </h4>
    </div>
    <div id="debug_window_call_stack"  class="collapse in">
        <div class="table-responsive"><table class="table table-bordered">
       <thead> <tr><th>#</th><th>Function</th><th>File:Line</th></tr></thead>
       <tbody></tbody>
       </table></div>
</div>
  </div>

  <div class="panel panel-default">
    <div class="panel-heading">
      <h4 class="panel-title">
        <a data-toggle="collapse" class="collapse-toggle" href="#debug_window_local_variables">Local Variables</a>
      </h4>
    </div>
    <div id="debug_window_local_variables" class="collapse in">
        <div class="table-responsive"><table class="table table-bordered">
       <thead> <tr><th>Variable</th><th>Value</th></tr></thead>
       <tbody></tbody>
       </table></div>
</div>
</div>

<div class="panel panel-default panel-registers">
    <div class="panel-heading">
      <h4 class="panel-title">
        <a data-toggle="collapse" class="collapse-toggle" href="#debug_window_registers">Registers</a>
      </h4>
    </div>
    <div id="debug_window_registers" class="collapse in">
        <div class="table-responsive"><table class="table table-bordered">
       <thead> <tr><th>Register</th><th>Value</th></tr></thead>
       <tbody></tbody>
       </table></div>
</div>
</div>

<div class="panel panel-default panel-display-expression">
    <div class="panel-heading">
      <h4 class="panel-title">
        <a data-toggle="collapse" class="collapse-toggle" href="#debug_window_display_expression">Display Expressions</a>
      </h4>
    </div>
    <div id="debug_window_display_expression" class="collapse in">
    <div class="table-responsive">
        <table class="table table-bordered" style="margin-bottom:0px">
       <thead><tr><th>Expression</th><th>Value</th><th></th></tr></thead>
       <tbody>
       </tbody>
       </table>
       <input id="input_watch_expr" class="col-sm-12" placeholder="Enter expression to watch"/>
    </div>
</div>
</div>

<div class="panel panel-default">
    <div class="panel-heading">
      <h4 class="panel-title">
        <a data-toggle="collapse" class="collapse-toggle" href="#debug_window_breakpoints">Breakpoints and Watchpoints</a>
      </h4>
    </div>
    <div id="debug_window_breakpoints" class="collapse in">
        <div class="table-responsive"><table class="table table-bordered">
       <thead><tr><th></th><th>#</th><th>Description</th><th></th></tr></thead>
       <tbody></tbody>
       </table></div>
</div>
</div>

  </div>
</div> 
                <!-- right component end -->
            </div>
        </div>
        <div class="right-sidebar">
            <span id="right-sidebar-close" class="btn btn-info glyphicon glyphicon-menu-right" ></span>
                

        </div>
    
    
    <script>
        $(document).ready(function() {
            Mousetrap.bind('f8', function() { trace_event('Key-F8'); $('#control-btn-debug').click(); return false;});
            Mousetrap.bind("f9", function() { trace_event('Key-F9'); $('#control-btn-run').click(); return false;});
            Mousetrap.bind(['command+s', 'ctrl+s'], function() { trace_event('Key-Ctrl+S'); $('#control-btn-save').click(); return false; });
            Mousetrap.bind(['command+b', 'ctrl+b'], function() { trace_event('Key-Ctrl+B'); $('#control-btn-beautify').click(); return false; });
            Mousetrap.bind(['command+m', 'ctrl+m'], function() { trace_event('Key-Ctrl+M'); $('#control-btn-newfile').click(); return false; });
        
            var editor = $("#multi_editor_container").editor();
            editor.setModeForLang($("#lang-select").val());

            

            
            
            

            editor.addEventListener('breakpoint_set', function (e) { 
                var bp = e.breakpoint;
                ide.setBreakpoint(bp);
            });
            editor.addEventListener('breakpoint_unset', function (e) { 
                var bp = e.breakpoint;
                ide.clearBreakpoint(bp);
            });
            $("#control-btn-newfile").on('click', function(){
                editor.new_editor();
                //track_event('control_menu', 'newfile');
            });

            $("#control-btn-upload").on('click', function(){
                ide.upload_file();
                //track_event('control_menu', 'upload');
            });
            $("#control-btn-save").on('click', function(){
                saveCode();
                //track_event('control_menu', 'save');
            });  

            ide.editor = editor;    
            //these guys can work after editor is initialized
            enable_btn('control-btn-',['save','share','beautify','download']);      
        });
        
        /*
        ace.require("ace/ext/language_tools");
        var editor = ace.edit("editor1");
        var editor2 = ace.edit("editor2");
        editor.getSession().setTabSize(4);
        editor.setFontSize('medium');
        editor.setTheme("ace/theme/idle_fingers");
        editor.getSession().setMode("ace/mode/c_cpp");
        // enable autocompletion and snippets
        editor.setOptions({
            enableBasicAutocompletion: true,
            enableSnippets: true,
            enableLiveAutocompletion: true
        });
        editor.on("guttermousedown", function(e){ 
           // if(!ide.gdbstarted) return;
            var Range = ace.require('ace/range').Range;

            var target = e.domEvent.target; 
            if (target.className.indexOf("ace_gutter-cell") == -1) 
                return; 

            if (e.clientX > 25 + target.getBoundingClientRect().left) 
                return; 

            var row = e.getDocumentPosition().row 

            if (target.className.indexOf("ace_breakpoint") == -1)
                ide.setBreakpoint(row+1, true);//e.editor.session.setBreakpoint(row)
            else
                ide.clearBreakpoint(row+1, true);//e.editor.session.clearBreakpoint(row)
            e.stop() 
        }); 
        
        editor.addBreakpoint = function(line, breaknumber) {
            if(!editor.breakpointList){
                editor.breakpointList = [];
            }
            editor.breakpointList[breaknumber] = line;
            console.log(editor.breakpointList);
        }
        */
        
        var project_uid = null;
        
        
    </script>
    
    <script>
        /*_native.init("CK7DC2JE", {
          targetClass: 'native-js'
        });*/
        </script>
<script>
    function track_event(arg1, arg2){
        //if(typeof ga !== 'undefined' && ga) ga('send', 'event', arg1, arg2);
        if(gtag)
        gtag('event', arg2, {
        'event_category': arg1
        });
    }
    function is_mobile(){
        return $('#mobile_test_element').css('display')=='none';
    }

    (function () {
        if(no_ads) return;
        if (typeof _bsa !== 'undefined' && _bsa) {
            /*_bsa.init('custom', 'CK7DC2JE', 'placement:onlinegdbcom', {
                target: '#native-inline',
                template: '<a href="##link##" target="_blank" rel="noopener" rel="nofollow"><div class="sponsor">Sponsor</div><div class="native-description">##company## — ##description##</div></a>'
            });*/
            
            if(!is_mobile()) {

            _bsa.init('custom', 'CK7I6K7M', 'placement:onlinegdbcom-top', {
                target: '#native-inline',
                template: `<a href="##link##" target="_blank" rel="noopener" rel="nofollow"><div class="sponsor">Sponsor</div><div class="native-description">##company## — ##description##</div></a>`
            });
            }
            if(!do_fallback_ad_check) {
            _bsa.init('custom', 'CK7DC2JE', 'placement:onlinegdbcom-banner', {
                target: '#native-banner',
                template: `
            <a href="##link##" class="native-banner" style="background: linear-gradient(-30deg, ##backgroundColor##E5, ##backgroundColor##E5 45%, ##backgroundColor## 45%) #fff;">
              <div class="native-main">
                <img class="native-img" img src="##logo##">
                <div class="native-details" style="color: ##textColor##">
                  <span class="native-company">Sponsored by ##company##</span>
                  <span class="native-desc">##description##</span>
                </div>
                <span class="native-cta" style="color: ##ctaTextColor##; background-color: ##ctaBackgroundColor##;">##callToAction##</span>
              </div>
            </a>
            <a class="native-via" href="##adViaLink##">Ads via BuySellAds</a>
            `
            });
            }
        } else {
            track_event('BSA Undefined', 'bsa_undefined');
        }
    })();
</script>

<script>
    /*
    _bsa.init('custom', 'CVADC53U', 'placement:onlinegdbcom', {
        target: '.native-js',
        template: '<a href="##link##" target="_blank" rel="noopener" rel="nofollow"><span class="sponsor">Sponsor</span> ##company## — ##description##</a>'
    });*/

    function fallback_native_top(){
        return false;
        
        var html = '<a href="/contribute" target="_blank" rel="noopener"><div class="sponsor">Contribute</div><div class="native-description">Submit a programming article and win assured Amazon gift voucher!!</div></a>';
        $("#native-inline").html(html);
        return true;
        
    }
    function process_no_bottom_adunit() {
        return;
        if(!do_fallback_ad_check) return;
        var script = document.createElement("script"); 
        script.src = "https://cdn.thisiswaldo.com/static/js/5831.js"; 
        script.type = "text/javascript"; 
        document.getElementById("ad_unit_bottom_wrapper").appendChild(script);
    }
    function BSANativeCallback(data) {
        if (data.segment=="placement:onlinegdbcom-top") {
            if((data.ads && data.ads.length > 0) || fallback_native_top())  {
                $("#editor-container").css('top', '37px');
                $("#editor_1").css('top', '57px');
                $("#title-bar").css('padding-top', '5px');
                $("#title-bar").css('padding-bottom', '5px');
                track_event('BSA Top AdUnit', 'bsa_top_adunit');
            } else {
                track_event('BSA No Top AdUnit', 'bsa_no_top_adunit');
            }
        } else if (data.segment=="placement:onlinegdbcom-banner") {
            if(data.ads && data.ads.length > 0) {
                track_event('BSA Bottom AdUnit', 'bsa_bottom_adunit');
            } else {
                process_no_bottom_adunit();
                track_event('BSA No Bottom AdUnit', 'bsa_no_bottom_adunit');
            }
        } else {
            track_event('BSA No AdUnit', 'bsa_no_adunit');
        }
    }
</script>

    

<!--<script src="//control.mockingfish.com/js/011503.js"></script>-->


    </div>
</div>
        </div>
    </div>
        </div>

    <!-- Runtime exceeds reason Modal -->
    <div id="runtimeModal" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Possible reasons for Runtime Exceed error</h4> </div>
                <div class="modal-body">
                    <p>
                    <ol>
                        <li>If your program is reading input from standard input and you forgot to provide input via stdin.</li>
                        <li>Your program contains infinite loop, which may never break.</li>
                        <li>Your program contains infinite recursive function calls.</li>
                        <li>May be your program is trying to process large data and it takes much time to process</li>
                    </ol>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">ok</button>
                </div>
            </div>
        </div>
    </div>
    <!-- generic modal -->
    <div id="genericModal" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close modal-btn-close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title"></h4> </div>
                <div class="modal-body">
                </div>
                <div class="modal-footer">
                    <button type="button" class="ok-btn btn btn-default" data-dismiss="modal">Ok</button>
                </div>
            </div>
        </div>
    </div>
    <!-- New Version Available Modal -->
    <div id="newVersionModal" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">New Version Available</h4> </div>
                <div class="modal-body">
                    <p>
                    New Version of OnlineGDB is available. Please save your data and refresh page to update.
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Ok</button>
                </div>
            </div>
        </div>
    </div>
    <!-- Console Output Modal -->
    <div id="consoleOutputModal" class="modal fade" role="dialog">
        <div class="modal-dialog" style="width:700px; height:90%">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Running Turbo C Project</h4> </div>
                <div class="modal-body">
                    <div class="dosbox-container">
                    <canvas id="jsdos">
                    </canvas>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Code Save Modal -->
    <div id="saveCodeModal" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Save Project</h4> </div>
                <div class="modal-body">
                    <div>
                        <form>
                        <div class="form-group">
                            <label for="name" class="name_label">Name of Project:</label>
                            <input type="text" class="form-control" id="project_name" value="">
                        </div>
                        <button type="button"  class="btn btn-default btn_save">Save</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Compile Flags Modal -->
    <div id="compilerFlagsModal" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close hide" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Extra Compiler Flags</h4> </div>
                <div class="modal-body">
                    <div>
                        <form>
                        <div class="form-group">
                            <label for="name" class="name_label"></label>
                            <input type="text" class="form-control" id="compiler_flags" placeholder="You can set extra compiler flags here. Leave this empty if you don't know about it." value="">
                        </div>
                        <button type="button"  class="btn btn-default btn_save" data-dismiss="modal">Ok</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Delete file Modal -->
    <div id="deleteFileModal" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <center><h4 class="modal-title">Are you sure you want to delete file `<span id='delete_file_name'></span>`?</h4> 
                    </center>
                    </div>
                <div class="modal-body">
                    <center>
                        <button type="button" class="btn btn-default btn-ok">Yes</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">No</button>
                    </center>
                </div>
            </div>
        </div>
    </div>
    <!-- generic confirm Modal -->
    <div id="confirmModal" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <center><h4 class="modal-title"></h4></center>
                    </div>
                <div class="modal-body">
                    <center>
                        <button type="button" class="btn btn-default btn-ok">Yes</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">No</button>
                    </center>
                </div>
            </div>
        </div>
    </div>
     <!-- New file Modal -->
    <div id="newFileModal" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">New File</h4> </div>
                <div class="modal-body">
                    <div>
                        <form>
                        <div class="form-group">
                            <label for="name">Name of new file:</label>
                            <input type="text" class="form-control" id="new_file_name" value="untitled">
                        </div>
                        <button type="button" class="btn btn-default btn-ok">ok</button>
                        <span class="error_message"></span>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Rename file Modal -->
    <div id="renameFileModal" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Rename File</h4> </div>
                <div class="modal-body">
                    <div>
                        <form>
                        <div class="form-group">
                            <label for="name">Name:</label>
                            <input type="text" class="form-control" id="edit_file_name" value="">
                        </div>
                        <button type="button" class="btn btn-default btn-ok">ok</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">cancel</button>
                        <span class="error_message"></span>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Code Share Modal -->
    <div id="shareCodeModal" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Share Link</h4> </div>
                <center class="msg">source code is copied to below link.</center>
                <div class="modal-body" style="text-align:center">
                    <p></p>
                </div>
            </div>
        </div>
    </div>
    <!-- Server disconnected Modal -->
    <div id="serverDisconnectedModal" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Lost connection to server</h4> </div>
                <div class="modal-body">
                    <p>Oops! Connection to server is lost. Please refresh the page to reconnect.</p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">ok</button>
                </div>
            </div>
        </div>
    </div>
    <!-- Debugging session stopped Modal -->
    <div id="myModal" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Debug session stopped</h4> </div>
                <div class="modal-body">
                    <p>Debug session is being stopped due to inactivity.</p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">ok</button>
                </div>
            </div>
        </div>
    </div>
    <!-- Debugging session stopped Modal -->
    <div id="noDebugPythonModal" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <center>
                    <h4 class="modal-title">Debug mode for <span class="lang">python</span> program is not yet supported.</h4> 
                    </center>
                    </div>
                    
                <div class="modal-footer">
                    <center>
                    <button type="button" class="btn btn-default" data-dismiss="modal">ok</button>
                    </center>
                </div>
            </div>
        </div>
    </div>
    <!-- login form modal -->
    <div id="loginModal" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Login to your account</h4> </div>
                <div class="modal-body">
                    <div style="width:100%">
                    <div class="omb_login">
                        <h3 class="omb_authTitle">Login with
                            <!--or <a href="#" style="font-size:24px; color:#337ab7">Sign up</a></h3>-->
                            <div class="row omb_row-sm-offset-31 omb_socialButtons">
                                <div class="col-xs-4">
                                    <a href="#" onclick="login('googleplus')" class="btn btn-lg btn-block omb_btn-google">
                                        <i class="fa fa-facebook visible-xs"></i>
                                        <span class="hidden-xs">Google+</span>
                                    </a>
                                </div>
                                <div class="col-xs-4">
                                    <a href="#" onclick="login('facebook')" class="btn btn-lg btn-block omb_btn-facebook">
                                        <i class="fa fa-twitter visible-xs"></i>
                                        <span class="hidden-xs">Facebook</span>
                                    </a>
                                </div>
                                <div class="col-xs-4">
                                    <a href="#" onclick="login('github')" class="btn btn-lg btn-block omb_btn-github">
                                        <i class="fa fa-google-plus visible-xs"></i>
                                        <span class="hidden-xs">Github</span>
                                    </a>
                                </div>
                            </div>
                    </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <!-- Run session stopped Modal -->
    <div id="myModalRun" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Run Console session stopped</h4> </div>
                <div class="modal-body">
                    <p>Run Console is being stopped due to inactivity.</p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">ok</button>
                </div>
            </div>
        </div>
    </div>
    <!-- Add University Modal -->
    <div class="modal fade" id="myModalAddUniversity" role="dialog">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Add School/Univeristy/Institute</h4>
      </div>
      <form method="post" action="/university">
      <div class="modal-body">
	   <div class="form-group">
		   <label for="university_name">School/University/Institute Name<span class="text-danger">*</span></label>
            <input type="text" class="form-control" name="university_name" id="university_name" placeholder="Enter university" required>
          </div>
	  <div class="form-group">
		  <label for="state">State<span class="text-danger">*</span></label>
            <input type="text" class="form-control" name="state" id="state" placeholder="State" required>
          </div>
	  <div class="form-group">
      	            <label for="country">Country<span class="text-danger">*</span></label>
		  <select  class="selectpicker border rounded form-control h-50" name="country"  data-width="100%" data-show-subtext="true" data-live-search="true" required>
			  <option data-hidden="true" value="">Select Country</option>
			
                        </select>
	</div>
      </div>

      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-success" onclick="addNewUniversity()">Submit</button>
      </div>
      </form>
    </div>
  </div>
</div>
    <!-- Editor Info Modal -->
    <div id="infoModal" class="modal fade" role="dialog">
        <div class="modal-dialog">
            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Keyboard Shortcuts</h4> </div>
                <div class="modal-body"> <pre><b>IDE Shortcuts:</b>
New file : Ctrl-M
Run Code : F9
Debug Code : F8
Save Project : Ctrl-S
Beautify Code : Ctrl-B
Settings Menu : Ctrl-Shift-S
Info : Ctrl-I

<b>Editor Shortcuts:</b>
showSettingsMenu : Ctrl-,
goToNextError : Alt-E
goToPreviousError : Alt-Shift-E
selectall : Ctrl-A
gotoline : Ctrl-L
fold : Alt-L|Ctrl-F1
unfold : Alt-Shift-L|Ctrl-Shift-F1
toggleFoldWidget : F2
toggleParentFoldWidget : Alt-F2
foldOther : Alt-0
unfoldall : Alt-Shift-0
findnext : Ctrl-K
findprevious : Ctrl-Shift-K
selectOrFindNext : Alt-K
selectOrFindPrevious : Alt-Shift-K
find : Ctrl-F
overwrite : Insert
selecttostart : Ctrl-Shift-Home
gotostart : Ctrl-Home
selectup : Shift-Up
golineup : Up
selecttoend : Ctrl-Shift-End
gotoend : Ctrl-End
selectdown : Shift-Down
golinedown : Down
selectwordleft : Ctrl-Shift-Left
gotowordleft : Ctrl-Left
selecttolinestart : Alt-Shift-Left
gotolinestart : Alt-Left|Home
selectleft : Shift-Left
gotoleft : Left
selectwordright : Ctrl-Shift-Right
gotowordright : Ctrl-Right
selecttolineend : Alt-Shift-Right
gotolineend : Alt-Right|End
selectright : Shift-Right
gotoright : Right
selectpagedown : Shift-Pagedown
gotopagedown : Pagedown
selectpageup : Shift-Pageup
gotopageup : Pageup
scrollup : Ctrl-Up
scrolldown : Ctrl-Down
selectlinestart : Shift-Home
selectlineend : Shift-End
togglerecording : Ctrl-Alt-E
replaymacro : Ctrl-Shift-E
jumptomatching : Ctrl-P
selecttomatching : Ctrl-Shift-P
expandToMatching : Ctrl-Shift-M
removeline : Ctrl-D
duplicateSelection : Ctrl-Shift-D
sortlines : Ctrl-Alt-S
togglecomment : Ctrl-/
toggleBlockComment : Ctrl-Shift-/
modifyNumberUp : Ctrl-Shift-Up
modifyNumberDown : Ctrl-Shift-Down
replace : Ctrl-H
undo : Ctrl-Z
redo : Ctrl-Shift-Z|Ctrl-Y
copylinesup : Alt-Shift-Up
movelinesup : Alt-Up
copylinesdown : Alt-Shift-Down
movelinesdown : Alt-Down
del : Delete
backspace : Shift-Backspace|Backspace
cut_or_delete : Shift-Delete
removetolinestart : Alt-Backspace
removetolineend : Alt-Delete
removewordleft : Ctrl-Backspace
removewordright : Ctrl-Delete
outdent : Shift-Tab
indent : Tab
blockoutdent : Ctrl-[
blockindent : Ctrl-]
transposeletters : Ctrl-T
touppercase : Ctrl-U
tolowercase : Ctrl-Shift-U
expandtoline : Ctrl-Shift-L
addCursorAbove : Ctrl-Alt-Up
addCursorBelow : Ctrl-Alt-Down
addCursorAboveSkipCurrent : Ctrl-Alt-Shift-Up
addCursorBelowSkipCurrent : Ctrl-Alt-Shift-Down
selectMoreBefore : Ctrl-Alt-Left
selectMoreAfter : Ctrl-Alt-Right
selectNextBefore : Ctrl-Alt-Shift-Left
selectNextAfter : Ctrl-Alt-Shift-Right
splitIntoLines : Ctrl-Alt-L
alignCursors : Ctrl-Alt-A
findAll : Ctrl-Alt-K
showKeyboardShortcuts : Ctrl-Alt-H
          </pre> </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>
    <script>
    var isLoggedIn =  false;
    var isTinyide =  false; 
    var isStudentSubmission =  false ;

    function track_event(arg1, arg2, arg3){
        //if(ga) ga('send', 'event', arg1, arg2, arg3);
        if(gtag)
        gtag('event', arg2, {
        'event_category': arg1,
        'event_label': arg3
        });
    }
    var check_fallback_ad_timer = null;
    function repalce_fallback_ad(){
    
    }
    function check_fallback_ad_helper(){
        var ad_text = $("#ad_wrapper").text();
        //track_event('Check Fallback Ad', 'check_fallback_ad');

        if(ad_text.indexOf("ads via")>-1){// ad is loaded
            if(ad_text.indexOf("Have fun taking surveys and get paid!")>-1){// fallback ad 
                repalce_fallback_ad();
            }
            clearInterval(check_fallback_ad_timer);
        }
    }
    function check_fallback_ad(){
        check_fallback_ad_timer = setInterval(check_fallback_ad_helper, 2000); // check every 2 seconds
    }
    function update_snippet_datetime(){
        
    }
    $(document).ready(function() {
        $('div.split-pane').splitPane();
        if(do_fallback_ad_check)
            check_fallback_ad();
        update_snippet_datetime();

            $( ".ogdb-local-date" ).each(function( index ) {
        var ogdb_date = $(this).attr('ogdb-local-date');
        if(ogdb_date!='')
            ogdb_date = new Date(ogdb_date).toLocaleString([], { hour12: true});
        else
            ogdb_date = "Invalid Date";
        $(this).text(ogdb_date);
        });
    });
    </script>
    
    <!-- Global site tag (gtag.js) - Google Analytics -->
<script async src="https://www.googletagmanager.com/gtag/js?id=UA-79897653-2"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  
  gtag('config', 'UA-79897653-2');
  
</script>




<!--
<script>
window['_fs_debug'] = false;
window['_fs_host'] = 'fullstory.com';
window['_fs_org'] = 'B881V';
window['_fs_namespace'] = 'FS';
(function(m,n,e,t,l,o,g,y){
    if (e in m) {if(m.console && m.console.log) { m.console.log('FullStory namespace conflict. Please set window["_fs_namespace"].');} return;}
    g=m[e]=function(a,b){g.q?g.q.push([a,b]):g._api(a,b);};g.q=[];
    o=n.createElement(t);o.async=1;o.src='https://'+_fs_host+'/s/fs.js';
    y=n.getElementsByTagName(t)[0];y.parentNode.insertBefore(o,y);
    g.identify=function(i,v){g(l,{uid:i});if(v)g(l,v)};g.setUserVars=function(v){g(l,v)};
    y="rec";g.shutdown=function(i,v){g(y,!1)};g.restart=function(i,v){g(y,!0)};
    g.identifyAccount=function(i,v){o='account';v=v||{};v.acctId=i;g(o,v)};
    g.clearUserCookie=function(){};
})(window,document,window['_fs_namespace'],'script','user');
</script>
-->
        <!-- Go to www.addthis.com/dashboard to customize your tools --> <script type="text/javascript" src="//s7.addthis.com/js/300/addthis_widget.js#pubid=ra-57a770c71976bf87"></script> 
<!--<script type="text/javascript" src="//s7.addthis.com/js/300/addthis_widget.js#pubid=ra-57a770c71976bf87"></script>-->
<!--Start of Tawk.to Script-->

<!--End of Tawk.to Script-->



<!--   <script src="https://cdn.ravenjs.com/3.14.2/raven.min.js" crossorigin="anonymous"></script>
    <script>Raven.config('https://33e437c2b49247e2995f75c8bde618e1@sentry.io/164141').install();</script>-->

</body>

</html>
